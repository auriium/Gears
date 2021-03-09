package me.aurium.beetle.gears.producer;

import me.aurium.beetle.api.file.producer.Producer;
import me.aurium.beetle.api.file.producer.ProducerKey;

import java.nio.file.Path;

public class MutableConfKey<Z> implements ProducerKey<MutableConfProducer<Z>,MutableConfOptions> {

    private final String identifier;
    private final Class<Z> configType;

    public <X> MutableConfKey(String identifier, Class<Z> configType) {
        this.identifier = identifier;
        this.configType = configType;
    }

    @Override
    public MutableConfProducer<Z> newProducer(MutableConfOptions options, Path path) {

        new MutableConfProducer<>(configType);

        return null;

    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean isInstance(Producer producer) {
        if (!(producer instanceof MutableConfProducer)) {
            return false;
        }

        MutableConfProducer<?> fuckass = (MutableConfProducer<?>) producer;

        return fuckass.getProducedType() == configType;

    }

}

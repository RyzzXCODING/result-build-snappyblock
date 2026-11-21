package io.github.profetgit.snappyblocks.mixin;

import io.github.profetgit.snappyblocks.burst.BreakParticles;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleEngine.class)
public abstract class BreakParticleMixin {
    @Inject(method = "add(Lnet/minecraft/client/particle/Particle;)V", at = @At("HEAD"), cancellable = true)
    private void snappy_blocks$noBreakParticles(Particle particle, CallbackInfo ci) {
        if (BreakParticles.handling()) ci.cancel();
    }
}

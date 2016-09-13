package jogen.physics.world.object;

public class PhysicsObject extends GraphicsObject {
  public Position position;
  public Rotation rotation;
  public Velocity velocity;
  
  public float getVelocity() {
    return this.velocity.getAverage();
  }
  public static float getVelocity(PhysicsObject object) {
    return object.getVelocity();
  }
}

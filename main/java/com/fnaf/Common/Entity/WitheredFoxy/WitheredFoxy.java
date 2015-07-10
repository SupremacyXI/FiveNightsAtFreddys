// Date: 6/19/2015 12:46:06 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.fnaf.Common.Entity.WitheredFoxy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WitheredFoxy extends ModelBase
{
  //fields
    ModelRenderer Right_Leg_1;
    ModelRenderer Left_Leg_1;
    ModelRenderer Right_Leg_2;
    ModelRenderer Left_Leg_2;
    ModelRenderer Right_Knee;
    ModelRenderer Left_Knee;
    ModelRenderer Hip;
    ModelRenderer Right_Leg_3;
    ModelRenderer Left_Leg_3;
    ModelRenderer Body_articulation;
    ModelRenderer Body;
    ModelRenderer Neck;
    ModelRenderer Lower_Mouth_1;
    ModelRenderer Lower_Mouth_2;
    ModelRenderer Head_1;
    ModelRenderer Head_2;
    ModelRenderer Head_3;
    ModelRenderer Upper_Mouth_1;
    ModelRenderer Upper_Mouth_2;
    ModelRenderer Nose;
    ModelRenderer Right_Ear_1;
    ModelRenderer Left_Ear_1;
    ModelRenderer Right_shoulder;
    ModelRenderer Left_shoulder;
    ModelRenderer Right_Arm_1;
    ModelRenderer Left_Arm_1;
    ModelRenderer Right_Arm_2;
    ModelRenderer Left_Arm_2;
    ModelRenderer Hook_Base_1;
    ModelRenderer Left_Hand;
    ModelRenderer hair_1;
    ModelRenderer hair_2;
    ModelRenderer hair_3;
    ModelRenderer Right_Ear_2;
    ModelRenderer Lower_Mouth_3;
    ModelRenderer Right_Ear_3;
    ModelRenderer Left_Ear_2;
    ModelRenderer Left_Ear_3;
    ModelRenderer Right_Ear_4;
    ModelRenderer Left_Ear_4;
    ModelRenderer Head_4;
    ModelRenderer Head_5;
    ModelRenderer Head_6;
    ModelRenderer Hook_Base_2;
    ModelRenderer Hook;
    ModelRenderer Patch;
    ModelRenderer Right_Eye;
    ModelRenderer Left_Eye;
    ModelRenderer Right_pupil;
    ModelRenderer Left_pupil;
    ModelRenderer Left_Finger_1;
    ModelRenderer Left_Finger_2;
    ModelRenderer Left_Finger_3;
    ModelRenderer Left_Finger_4;
    ModelRenderer Head_7;
    ModelRenderer Head_8;
    ModelRenderer Upper_Mouth_3;
    ModelRenderer Teeth_1;
    ModelRenderer Teeth_2;
    ModelRenderer Teeth_3;
    ModelRenderer Teeth_4;
    ModelRenderer Teeth_5;
    ModelRenderer Teeth_6;
    ModelRenderer Teeth_7;
    ModelRenderer Teeth_8;
    ModelRenderer Teeth_9;
  
  public WitheredFoxy()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      Right_Leg_1 = new ModelRenderer(this, 0, 0);
      Right_Leg_1.addBox(-1.5F, 0F, -6F, 3, 1, 6);
      Right_Leg_1.setRotationPoint(-2F, 23F, 4F);
      Right_Leg_1.setTextureSize(128, 64);
      Right_Leg_1.mirror = true;
      setRotation(Right_Leg_1, 0F, 0F, 0F);
      Left_Leg_1 = new ModelRenderer(this, 0, 0);
      Left_Leg_1.addBox(-1.5F, 0F, -6F, 3, 1, 6);
      Left_Leg_1.setRotationPoint(2F, 23F, 4F);
      Left_Leg_1.setTextureSize(128, 64);
      Left_Leg_1.mirror = true;
      setRotation(Left_Leg_1, 0F, 0F, 0F);
      Right_Leg_2 = new ModelRenderer(this, 0, 18);
      Right_Leg_2.addBox(-0.5F, 0F, -0.7F, 1, 6, 1);
      Right_Leg_2.setRotationPoint(-2F, 17F, 2F);
      Right_Leg_2.setTextureSize(128, 64);
      Right_Leg_2.mirror = true;
      setRotation(Right_Leg_2, 0.122173F, 0F, 0F);
      Left_Leg_2 = new ModelRenderer(this, 0, 18);
      Left_Leg_2.addBox(-0.5F, 0F, -0.7F, 1, 6, 1);
      Left_Leg_2.setRotationPoint(2F, 17F, 2F);
      Left_Leg_2.setTextureSize(128, 64);
      Left_Leg_2.mirror = true;
      setRotation(Left_Leg_2, 0.122173F, 0F, 0F);
      Right_Knee = new ModelRenderer(this, 0, 44);
      Right_Knee.addBox(-1F, 0F, -1.5F, 2, 3, 2);
      Right_Knee.setRotationPoint(-2F, 15F, 2.5F);
      Right_Knee.setTextureSize(128, 64);
      Right_Knee.mirror = true;
      setRotation(Right_Knee, 0F, 0F, 0F);
      Left_Knee = new ModelRenderer(this, 0, 44);
      Left_Knee.addBox(-1F, 0F, -1.5F, 2, 3, 2);
      Left_Knee.setRotationPoint(2F, 15F, 2.5F);
      Left_Knee.setTextureSize(128, 64);
      Left_Knee.mirror = true;
      setRotation(Left_Knee, 0F, 0F, 0F);
      Hip = new ModelRenderer(this, 0, 53);
      Hip.addBox(-3.5F, 0F, -2.5F, 7, 2, 5);
      Hip.setRotationPoint(0F, 9.466666F, 1.7F);
      Hip.setTextureSize(128, 64);
      Hip.mirror = true;
      setRotation(Hip, 0F, 0F, 0F);
      Right_Leg_3 = new ModelRenderer(this, 3, 34);
      Right_Leg_3.addBox(-1.5F, 0F, -2F, 3, 5, 3);
      Right_Leg_3.setRotationPoint(-2F, 11.46667F, 2.5F);
      Right_Leg_3.setTextureSize(128, 64);
      Right_Leg_3.mirror = true;
      setRotation(Right_Leg_3, 0F, 0F, 0F);
      Left_Leg_3 = new ModelRenderer(this, 0, 34);
      Left_Leg_3.addBox(-1.5F, 0F, -2F, 3, 5, 3);
      Left_Leg_3.setRotationPoint(2F, 11.46667F, 2.5F);
      Left_Leg_3.setTextureSize(128, 64);
      Left_Leg_3.mirror = true;
      setRotation(Left_Leg_3, 0F, 0F, 0F);
      Body_articulation = new ModelRenderer(this, 28, 55);
      Body_articulation.addBox(-2.5F, -4F, -1.6F, 5, 5, 4);
      Body_articulation.setRotationPoint(0F, 8.466666F, 1.5F);
      Body_articulation.setTextureSize(128, 64);
      Body_articulation.mirror = true;
      setRotation(Body_articulation, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 19, 26);
      Body.addBox(-3.5F, 0F, -2.466667F, 7, 9, 5);
      Body.setRotationPoint(0F, -0.4333333F, 1.733333F);
      Body.setTextureSize(128, 64);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 18, 19);
      Neck.addBox(-1F, -2.5F, -1F, 2, 3, 2);
      Neck.setRotationPoint(0F, -0.4333333F, 2.2F);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Lower_Mouth_1 = new ModelRenderer(this, 68, 56);
      Lower_Mouth_1.addBox(-2.5F, 0.1F, -5F, 5, 1, 4);
      Lower_Mouth_1.setRotationPoint(0F, -3.433333F, 2.733333F);
      Lower_Mouth_1.setTextureSize(128, 64);
      Lower_Mouth_1.mirror = true;
      setRotation(Lower_Mouth_1, 0.296706F, 0F, 0F);
      Lower_Mouth_2 = new ModelRenderer(this, 0, 12);
      Lower_Mouth_2.addBox(-1.5F, 0.1F, -8F, 3, 1, 3);
      Lower_Mouth_2.setRotationPoint(0F, -3.433333F, 2.733333F);
      Lower_Mouth_2.setTextureSize(128, 64);
      Lower_Mouth_2.mirror = true;
      setRotation(Lower_Mouth_2, 0.296706F, 0F, 0F);
      Head_1 = new ModelRenderer(this, 50, 44);
      Head_1.addBox(-3F, -6F, -4F, 4, 4, 5);
      Head_1.setRotationPoint(0F, -2.433333F, 2.733333F);
      Head_1.setTextureSize(128, 64);
      Head_1.mirror = true;
      setRotation(Head_1, 0F, 0F, 0F);
      Head_2 = new ModelRenderer(this, 51, 56);
      Head_2.addBox(-2F, -2F, -2F, 4, 2, 3);
      Head_2.setRotationPoint(0F, -2.433333F, 2.7F);
      Head_2.setTextureSize(128, 64);
      Head_2.mirror = true;
      setRotation(Head_2, 0F, 0F, 0F);
      Head_3 = new ModelRenderer(this, 50, 38);
      Head_3.addBox(-2.5F, -7F, -3.5F, 4, 1, 4);
      Head_3.setRotationPoint(0F, -2.433333F, 2.733333F);
      Head_3.setTextureSize(128, 64);
      Head_3.mirror = true;
      setRotation(Head_3, 0F, 0F, 0F);
      Upper_Mouth_1 = new ModelRenderer(this, 18, 14);
      Upper_Mouth_1.addBox(-2F, -3F, -6F, 4, 2, 2);
      Upper_Mouth_1.setRotationPoint(0F, -2.433333F, 2.733333F);
      Upper_Mouth_1.setTextureSize(128, 64);
      Upper_Mouth_1.mirror = true;
      setRotation(Upper_Mouth_1, 0F, 0F, 0F);
      Upper_Mouth_2 = new ModelRenderer(this, 36, 20);
      Upper_Mouth_2.addBox(-1.5F, -3F, -9F, 3, 2, 3);
      Upper_Mouth_2.setRotationPoint(0F, -2.433333F, 2.733333F);
      Upper_Mouth_2.setTextureSize(128, 64);
      Upper_Mouth_2.mirror = true;
      setRotation(Upper_Mouth_2, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 36, 17);
      Nose.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
      Nose.setRotationPoint(0F, -4.566667F, -5.866667F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, 0.2617994F, 0F, 0F);
      Right_Ear_1 = new ModelRenderer(this, 34, 11);
      Right_Ear_1.addBox(-1.5F, -5F, -1F, 3, 3, 1);
      Right_Ear_1.setRotationPoint(-2F, -7.433333F, 2.733333F);
      Right_Ear_1.setTextureSize(128, 64);
      Right_Ear_1.mirror = true;
      setRotation(Right_Ear_1, 0F, 0F, -0.8726646F);
      Left_Ear_1 = new ModelRenderer(this, 68, 11);
      Left_Ear_1.addBox(-1.5F, -5F, -1F, 3, 3, 1);
      Left_Ear_1.setRotationPoint(2F, -7.433333F, 2.733333F);
      Left_Ear_1.setTextureSize(128, 64);
      Left_Ear_1.mirror = true;
      setRotation(Left_Ear_1, 0F, 0F, 0.8726646F);
      Right_shoulder = new ModelRenderer(this, 25, 2);
      Right_shoulder.addBox(-2F, 0F, -1.5F, 3, 2, 3);
      Right_shoulder.setRotationPoint(-3.5F, -1F, 2F);
      Right_shoulder.setTextureSize(128, 64);
      Right_shoulder.mirror = true;
      setRotation(Right_shoulder, 0F, 0F, 0.3316126F);
      Left_shoulder = new ModelRenderer(this, 25, 2);
      Left_shoulder.addBox(-1F, 0F, -1.5F, 3, 2, 3);
      Left_shoulder.setRotationPoint(3.5F, -1F, 2F);
      Left_shoulder.setTextureSize(128, 64);
      Left_shoulder.mirror = true;
      setRotation(Left_shoulder, 0F, 0F, -0.3316126F);
      Right_Arm_1 = new ModelRenderer(this, 47, 5);
      Right_Arm_1.addBox(-2F, 0.5333334F, -1F, 2, 5, 2);
      Right_Arm_1.setRotationPoint(-3.5F, 0F, 2F);
      Right_Arm_1.setTextureSize(128, 64);
      Right_Arm_1.mirror = true;
      setRotation(Right_Arm_1, 0F, 0F, 0.2792527F);
      Left_Arm_1 = new ModelRenderer(this, 47, 5);
      Left_Arm_1.addBox(0F, 0.5333334F, -1F, 2, 5, 2);
      Left_Arm_1.setRotationPoint(3.5F, 0F, 2F);
      Left_Arm_1.setTextureSize(128, 64);
      Left_Arm_1.mirror = true;
      setRotation(Left_Arm_1, 0F, 0F, -0.2792527F);
      Right_Arm_2 = new ModelRenderer(this, 33, 31);
      Right_Arm_2.addBox(-1.5F, 0.5333334F, -1F, 2, 4, 2);
      Right_Arm_2.setRotationPoint(-5.5F, 4.5F, 2F);
      Right_Arm_2.setTextureSize(128, 64);
      Right_Arm_2.mirror = true;
      setRotation(Right_Arm_2, -0.1047198F, 0F, 0F);
      Left_Arm_2 = new ModelRenderer(this, 33, 31);
      Left_Arm_2.addBox(-0.5F, 0.5333334F, -1F, 2, 5, 2);
      Left_Arm_2.setRotationPoint(5.5F, 4.5F, 2F);
      Left_Arm_2.setTextureSize(128, 64);
      Left_Arm_2.mirror = true;
      setRotation(Left_Arm_2, -0.1047198F, 0F, 0F);
      Hook_Base_1 = new ModelRenderer(this, 51, 24);
      Hook_Base_1.addBox(-2F, 4.533333F, -1.5F, 3, 2, 3);
      Hook_Base_1.setRotationPoint(-5.5F, 4.5F, 2F);
      Hook_Base_1.setTextureSize(128, 64);
      Hook_Base_1.mirror = true;
      setRotation(Hook_Base_1, -0.1047198F, 0F, 0F);
      Left_Hand = new ModelRenderer(this, 51, 31);
      Left_Hand.addBox(0F, 5.533333F, -1.633333F, 1, 1, 3);
      Left_Hand.setRotationPoint(5.5F, 4.5F, 2F);
      Left_Hand.setTextureSize(128, 64);
      Left_Hand.mirror = true;
      setRotation(Left_Hand, -0.1047198F, 0F, 0F);
      hair_1 = new ModelRenderer(this, 64, 32);
      hair_1.addBox(-1F, -3F, 0F, 1, 2, 0);
      hair_1.setRotationPoint(0F, -8.433333F, 2.733333F);
      hair_1.setTextureSize(128, 64);
      hair_1.mirror = true;
      setRotation(hair_1, 0F, 0F, -0.4014257F);
      hair_2 = new ModelRenderer(this, 64, 32);
      hair_2.addBox(0F, -3F, 0F, 1, 2, 0);
      hair_2.setRotationPoint(0F, -8.433333F, 2.733333F);
      hair_2.setTextureSize(128, 64);
      hair_2.mirror = true;
      setRotation(hair_2, 0F, 0F, 0.4014257F);
      hair_3 = new ModelRenderer(this, 64, 32);
      hair_3.addBox(-0.5F, -3F, 0F, 1, 2, 0);
      hair_3.setRotationPoint(0F, -8.433333F, 2.733333F);
      hair_3.setTextureSize(128, 64);
      hair_3.mirror = true;
      setRotation(hair_3, 0F, 0F, 0F);
      Right_Ear_2 = new ModelRenderer(this, 20, 9);
      Right_Ear_2.addBox(-1F, -6F, -1F, 2, 1, 1);
      Right_Ear_2.setRotationPoint(-2F, -7.433333F, 2.733333F);
      Right_Ear_2.setTextureSize(128, 64);
      Right_Ear_2.mirror = true;
      setRotation(Right_Ear_2, 0F, 0F, -0.8726646F);
      Lower_Mouth_3 = new ModelRenderer(this, 0, 9);
      Lower_Mouth_3.addBox(-0.9666666F, 0.1F, -9F, 2, 1, 1);
      Lower_Mouth_3.setRotationPoint(0F, -3.433333F, 2.733333F);
      Lower_Mouth_3.setTextureSize(128, 64);
      Lower_Mouth_3.mirror = true;
      setRotation(Lower_Mouth_3, 0.296706F, 0F, 0F);
      Right_Ear_3 = new ModelRenderer(this, 20, 9);
      Right_Ear_3.addBox(-1F, -2F, -1F, 2, 1, 1);
      Right_Ear_3.setRotationPoint(-2F, -7.433333F, 2.733333F);
      Right_Ear_3.setTextureSize(128, 64);
      Right_Ear_3.mirror = true;
      setRotation(Right_Ear_3, 0F, 0F, -0.8726646F);
      Left_Ear_2 = new ModelRenderer(this, 69, 9);
      Left_Ear_2.addBox(-1F, -6F, -1F, 2, 1, 1);
      Left_Ear_2.setRotationPoint(2F, -7.433333F, 2.733333F);
      Left_Ear_2.setTextureSize(128, 64);
      Left_Ear_2.mirror = true;
      setRotation(Left_Ear_2, 0F, 0F, 0.8726646F);
      Left_Ear_3 = new ModelRenderer(this, 69, 9);
      Left_Ear_3.addBox(-1F, -2F, -1F, 2, 1, 1);
      Left_Ear_3.setRotationPoint(2F, -7.433333F, 2.733333F);
      Left_Ear_3.setTextureSize(128, 64);
      Left_Ear_3.mirror = true;
      setRotation(Left_Ear_3, 0F, 0F, 0.8726646F);
      Right_Ear_4 = new ModelRenderer(this, 12, 8);
      Right_Ear_4.addBox(-0.5F, -7F, -1F, 1, 1, 1);
      Right_Ear_4.setRotationPoint(-2F, -7.433333F, 2.733333F);
      Right_Ear_4.setTextureSize(128, 64);
      Right_Ear_4.mirror = true;
      setRotation(Right_Ear_4, 0F, 0F, -0.8726646F);
      Left_Ear_4 = new ModelRenderer(this, 70, 7);
      Left_Ear_4.addBox(-0.5F, -7F, -1F, 1, 1, 1);
      Left_Ear_4.setRotationPoint(2F, -7.433333F, 2.733333F);
      Left_Ear_4.setTextureSize(128, 64);
      Left_Ear_4.mirror = true;
      setRotation(Left_Ear_4, 0F, 0F, 0.8726646F);
      Head_4 = new ModelRenderer(this, 81, 44);
      Head_4.addBox(-5F, -2F, -4F, 10, 1, 3);
      Head_4.setRotationPoint(0F, -2.433333F, 2.733333F);
      Head_4.setTextureSize(128, 64);
      Head_4.mirror = true;
      setRotation(Head_4, 0F, 0F, 0F);
      Head_5 = new ModelRenderer(this, 30, 44);
      Head_5.addBox(-2F, -1F, -1.5F, 2, 1, 2);
      Head_5.setRotationPoint(-2.666667F, -4.366667F, 0.7333333F);
      Head_5.setTextureSize(128, 64);
      Head_5.mirror = true;
      setRotation(Head_5, 0F, 0F, -0.4537856F);
      Head_6 = new ModelRenderer(this, 30, 44);
      Head_6.addBox(0F, -1F, -1.5F, 2, 1, 2);
      Head_6.setRotationPoint(2.7F, -4.433333F, 0.7333333F);
      Head_6.setTextureSize(128, 64);
      Head_6.mirror = true;
      setRotation(Head_6, 0F, 0F, 0.4537856F);
      Hook_Base_2 = new ModelRenderer(this, 67, 24);
      Hook_Base_2.addBox(-1.5F, 6.533333F, -1F, 2, 1, 2);
      Hook_Base_2.setRotationPoint(-5.5F, 4.5F, 2F);
      Hook_Base_2.setTextureSize(128, 64);
      Hook_Base_2.mirror = true;
      setRotation(Hook_Base_2, -0.1047198F, 0F, 0F);
      Hook = new ModelRenderer(this, 51, 10);
      Hook.addBox(-0.5F, 7.533333F, -2.5F, 0, 5, 5);
      Hook.setRotationPoint(-5.5F, 4.5F, 2F);
      Hook.setTextureSize(128, 64);
      Hook.mirror = true;
      setRotation(Hook, -0.1047198F, 0F, 0F);
      Patch = new ModelRenderer(this, 41, 44);
      Patch.addBox(-1.7F, -2F, 0F, 2, 2, 0);
      Patch.setRotationPoint(-1F, -7.533333F, -1.266667F);
      Patch.setTextureSize(128, 64);
      Patch.mirror = true;
      setRotation(Patch, 1.241662F, 0F, 0F);
      Right_Eye = new ModelRenderer(this, 49, 46);
      Right_Eye.addBox(-2.666667F, -1F, -0.1333333F, 2, 2, 1);
      Right_Eye.setRotationPoint(0F, -6.5F, -1.266667F);
      Right_Eye.setTextureSize(128, 64);
      Right_Eye.mirror = true;
      setRotation(Right_Eye, 0F, 0F, 0F);
      Left_Eye = new ModelRenderer(this, 42, 49);
      Left_Eye.addBox(0.7F, -1F, -0.1333333F, 2, 2, 2);
      Left_Eye.setRotationPoint(0F, -6.5F, -1.266667F);
      Left_Eye.setTextureSize(128, 64);
      Left_Eye.mirror = true;
      setRotation(Left_Eye, 0F, 0F, 0F);
      Right_pupil = new ModelRenderer(this, 67, 47);
      Right_pupil.addBox(-1.9F, -0.4666667F, -0.2F, 1, 1, 1);
      Right_pupil.setRotationPoint(0F, -6.4F, -1.266667F);
      Right_pupil.setTextureSize(128, 64);
      Right_pupil.mirror = true;
      setRotation(Right_pupil, 0F, 0F, 0F);
      Left_pupil = new ModelRenderer(this, 67, 47);
      Left_pupil.addBox(0.9F, -0.4666667F, -0.2F, 1, 1, 1);
      Left_pupil.setRotationPoint(0F, -6.4F, -1.266667F);
      Left_pupil.setTextureSize(128, 64);
      Left_pupil.mirror = true;
      setRotation(Left_pupil, 0F, 0F, 0F);
      Left_Finger_1 = new ModelRenderer(this, 54, 31);
      Left_Finger_1.addBox(0F, 6.533333F, -1.633333F, 1, 3, 1);
      Left_Finger_1.setRotationPoint(5.5F, 4.5F, 2F);
      Left_Finger_1.setTextureSize(128, 64);
      Left_Finger_1.mirror = true;
      setRotation(Left_Finger_1, -0.122173F, 0F, 0F);
      Left_Finger_2 = new ModelRenderer(this, 54, 31);
      Left_Finger_2.addBox(0F, 6.533333F, 0.3666667F, 1, 3, 1);
      Left_Finger_2.setRotationPoint(5.5F, 4.5F, 2F);
      Left_Finger_2.setTextureSize(128, 64);
      Left_Finger_2.mirror = true;
      setRotation(Left_Finger_2, -0.0872665F, 0F, 0F);
      Left_Finger_3 = new ModelRenderer(this, 54, 31);
      Left_Finger_3.addBox(0.3F, 6.533333F, -0.6333333F, 1, 3, 1);
      Left_Finger_3.setRotationPoint(5.5F, 4.5F, 2F);
      Left_Finger_3.setTextureSize(128, 64);
      Left_Finger_3.mirror = true;
      setRotation(Left_Finger_3, -0.1047198F, 0F, 0F);
      Left_Finger_4 = new ModelRenderer(this, 54, 31);
      Left_Finger_4.addBox(0F, 0.5333334F, -2.633333F, 1, 2, 1);
      Left_Finger_4.setRotationPoint(5.5F, 10.5F, 2F);
      Left_Finger_4.setTextureSize(128, 64);
      Left_Finger_4.mirror = true;
      setRotation(Left_Finger_4, -0.2094395F, 0F, 0.4537856F);
      Head_7 = new ModelRenderer(this, 58, 47);
      Head_7.addBox(1F, -3F, -4F, 2, 1, 5);
      Head_7.setRotationPoint(0F, -2.433333F, 2.733333F);
      Head_7.setTextureSize(128, 64);
      Head_7.mirror = true;
      setRotation(Head_7, 0F, 0F, 0F);
      Head_8 = new ModelRenderer(this, 94, 53);
      Head_8.addBox(0.8F, -6F, -2.5F, 2, 3, 2);
      Head_8.setRotationPoint(0F, -2.433333F, 2.733333F);
      Head_8.setTextureSize(128, 64);
      Head_8.mirror = true;
      setRotation(Head_8, 0F, 0F, 0F);
      Upper_Mouth_3 = new ModelRenderer(this, 36, 20);
      Upper_Mouth_3.addBox(-0.5F, -1F, -3F, 1, 2, 3);
      Upper_Mouth_3.setRotationPoint(0F, -5.1F, -0.9333333F);
      Upper_Mouth_3.setTextureSize(128, 64);
      Upper_Mouth_3.mirror = true;
      setRotation(Upper_Mouth_3, 0.2094395F, 0F, 0F);
      Teeth_1 = new ModelRenderer(this, 45, 21);
      Teeth_1.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_1.setRotationPoint(0F, -4.5F, -5.1F);
      Teeth_1.setTextureSize(128, 64);
      Teeth_1.mirror = true;
      setRotation(Teeth_1, 0.7853982F, 0F, 0F);
      Teeth_2 = new ModelRenderer(this, 45, 21);
      Teeth_2.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_2.setRotationPoint(0F, -4.5F, -5.1F);
      Teeth_2.setTextureSize(128, 64);
      Teeth_2.mirror = true;
      setRotation(Teeth_2, 0.7853982F, 0F, 0F);
      Teeth_3 = new ModelRenderer(this, 45, 21);
      Teeth_3.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_3.setRotationPoint(0F, -4.5F, -4.1F);
      Teeth_3.setTextureSize(128, 64);
      Teeth_3.mirror = true;
      setRotation(Teeth_3, 0.7853982F, 0F, 0F);
      Teeth_4 = new ModelRenderer(this, 45, 21);
      Teeth_4.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_4.setRotationPoint(0F, -4.5F, -4.1F);
      Teeth_4.setTextureSize(128, 64);
      Teeth_4.mirror = true;
      setRotation(Teeth_4, 0.7853982F, 0F, 0F);
      Teeth_5 = new ModelRenderer(this, 45, 21);
      Teeth_5.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_5.setRotationPoint(0F, -4.5F, -3.1F);
      Teeth_5.setTextureSize(128, 64);
      Teeth_5.mirror = true;
      setRotation(Teeth_5, 0.7853982F, 0F, 0F);
      Teeth_6 = new ModelRenderer(this, 45, 21);
      Teeth_6.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
      Teeth_6.setRotationPoint(0F, -4.5F, -3.1F);
      Teeth_6.setTextureSize(128, 64);
      Teeth_6.mirror = true;
      setRotation(Teeth_6, 0.7853982F, 0F, 0F);
      Teeth_7 = new ModelRenderer(this, 45, 21);
      Teeth_7.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
      Teeth_7.setRotationPoint(-0.3F, -4.5F, -4.6F);
      Teeth_7.setTextureSize(128, 64);
      Teeth_7.mirror = true;
      setRotation(Teeth_7, 0F, 0F, 0.7853982F);
      Teeth_8 = new ModelRenderer(this, 45, 21);
      Teeth_8.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
      Teeth_8.setRotationPoint(0.3F, -4.5F, -4.6F);
      Teeth_8.setTextureSize(128, 64);
      Teeth_8.mirror = true;
      setRotation(Teeth_8, 0F, 0F, 0.7853982F);
      Teeth_9 = new ModelRenderer(this, 45, 21);
      Teeth_9.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
      Teeth_9.setRotationPoint(1F, -4.5F, -4.6F);
      Teeth_9.setTextureSize(128, 64);
      Teeth_9.mirror = true;
      setRotation(Teeth_9, 0F, 0F, 0.7853982F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Right_Leg_1.render(f5);
    Left_Leg_1.render(f5);
    Right_Leg_2.render(f5);
    Left_Leg_2.render(f5);
    Right_Knee.render(f5);
    Left_Knee.render(f5);
    Hip.render(f5);
    Right_Leg_3.render(f5);
    Left_Leg_3.render(f5);
    Body_articulation.render(f5);
    Body.render(f5);
    Neck.render(f5);
    Lower_Mouth_1.render(f5);
    Lower_Mouth_2.render(f5);
    Head_1.render(f5);
    Head_2.render(f5);
    Head_3.render(f5);
    Upper_Mouth_1.render(f5);
    Upper_Mouth_2.render(f5);
    Nose.render(f5);
    Right_Ear_1.render(f5);
    Left_Ear_1.render(f5);
    Right_shoulder.render(f5);
    Left_shoulder.render(f5);
    Right_Arm_1.render(f5);
    Left_Arm_1.render(f5);
    Right_Arm_2.render(f5);
    Left_Arm_2.render(f5);
    Hook_Base_1.render(f5);
    Left_Hand.render(f5);
    hair_1.render(f5);
    hair_2.render(f5);
    hair_3.render(f5);
    Right_Ear_2.render(f5);
    Lower_Mouth_3.render(f5);
    Right_Ear_3.render(f5);
    Left_Ear_2.render(f5);
    Left_Ear_3.render(f5);
    Right_Ear_4.render(f5);
    Left_Ear_4.render(f5);
    Head_4.render(f5);
    Head_5.render(f5);
    Head_6.render(f5);
    Hook_Base_2.render(f5);
    Hook.render(f5);
    Patch.render(f5);
    Right_Eye.render(f5);
    Left_Eye.render(f5);
    Right_pupil.render(f5);
    Left_pupil.render(f5);
    Left_Finger_1.render(f5);
    Left_Finger_2.render(f5);
    Left_Finger_3.render(f5);
    Left_Finger_4.render(f5);
    Head_7.render(f5);
    Head_8.render(f5);
    Upper_Mouth_3.render(f5);
    Teeth_1.render(f5);
    Teeth_2.render(f5);
    Teeth_3.render(f5);
    Teeth_4.render(f5);
    Teeth_5.render(f5);
    Teeth_6.render(f5);
    Teeth_7.render(f5);
    Teeth_8.render(f5);
    Teeth_9.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}

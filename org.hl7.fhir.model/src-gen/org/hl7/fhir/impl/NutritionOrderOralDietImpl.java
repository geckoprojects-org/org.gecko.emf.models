/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.NutritionOrderNutrient;
import org.hl7.fhir.NutritionOrderOralDiet;
import org.hl7.fhir.NutritionOrderSchedule;
import org.hl7.fhir.NutritionOrderTexture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nutrition Order Oral Diet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getNutrient <em>Nutrient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getFluidConsistencyType <em>Fluid Consistency Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.NutritionOrderOralDietImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NutritionOrderOralDietImpl extends BackboneElementImpl implements NutritionOrderOralDiet {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> type;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrderSchedule schedule;

	/**
	 * The cached value of the '{@link #getNutrient() <em>Nutrient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutrient()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderNutrient> nutrient;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected EList<NutritionOrderTexture> texture;

	/**
	 * The cached value of the '{@link #getFluidConsistencyType() <em>Fluid Consistency Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFluidConsistencyType()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> fluidConsistencyType;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NutritionOrderOralDietImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getNutritionOrderOralDiet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NutritionOrderSchedule getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(NutritionOrderSchedule newSchedule, NotificationChain msgs) {
		NutritionOrderSchedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchedule(NutritionOrderSchedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionOrderNutrient> getNutrient() {
		if (nutrient == null) {
			nutrient = new EObjectContainmentEList<NutritionOrderNutrient>(NutritionOrderNutrient.class, this, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT);
		}
		return nutrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NutritionOrderTexture> getTexture() {
		if (texture == null) {
			texture = new EObjectContainmentEList<NutritionOrderTexture>(NutritionOrderTexture.class, this, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE);
		}
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getFluidConsistencyType() {
		if (fluidConsistencyType == null) {
			fluidConsistencyType = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE);
		}
		return fluidConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.hl7.fhir.String getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(org.hl7.fhir.String newInstruction, NotificationChain msgs) {
		org.hl7.fhir.String oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstruction(org.hl7.fhir.String newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject)instruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject)newInstruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return ((InternalEList<?>)getNutrient()).basicRemove(otherEnd, msgs);
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return ((InternalEList<?>)getTexture()).basicRemove(otherEnd, msgs);
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return ((InternalEList<?>)getFluidConsistencyType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return basicSetInstruction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return getType();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return getSchedule();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return getNutrient();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return getTexture();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return getFluidConsistencyType();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return getInstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				setSchedule((NutritionOrderSchedule)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrient().clear();
				getNutrient().addAll((Collection<? extends NutritionOrderNutrient>)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTexture().clear();
				getTexture().addAll((Collection<? extends NutritionOrderTexture>)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyType().clear();
				getFluidConsistencyType().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				getType().clear();
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				setSchedule((NutritionOrderSchedule)null);
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				getNutrient().clear();
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				getTexture().clear();
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				getFluidConsistencyType().clear();
				return;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				setInstruction((org.hl7.fhir.String)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TYPE:
				return type != null && !type.isEmpty();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__SCHEDULE:
				return schedule != null;
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__NUTRIENT:
				return nutrient != null && !nutrient.isEmpty();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__TEXTURE:
				return texture != null && !texture.isEmpty();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__FLUID_CONSISTENCY_TYPE:
				return fluidConsistencyType != null && !fluidConsistencyType.isEmpty();
			case FHIRPackage.NUTRITION_ORDER_ORAL_DIET__INSTRUCTION:
				return instruction != null;
		}
		return super.eIsSet(featureID);
	}

} //NutritionOrderOralDietImpl

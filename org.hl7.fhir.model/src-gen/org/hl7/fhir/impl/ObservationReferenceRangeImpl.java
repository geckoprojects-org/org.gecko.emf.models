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
import org.hl7.fhir.Markdown;
import org.hl7.fhir.ObservationReferenceRange;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.Range;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getNormalValue <em>Normal Value</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationReferenceRangeImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationReferenceRangeImpl extends BackboneElementImpl implements ObservationReferenceRange {
	/**
	 * The cached value of the '{@link #getLow() <em>Low</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected Quantity low;

	/**
	 * The cached value of the '{@link #getHigh() <em>High</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected Quantity high;

	/**
	 * The cached value of the '{@link #getNormalValue() <em>Normal Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalValue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept normalValue;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> appliesTo;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Range age;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Markdown text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationReferenceRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getObservationReferenceRange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getLow() {
		return low;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLow(Quantity newLow, NotificationChain msgs) {
		Quantity oldLow = low;
		low = newLow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW, oldLow, newLow);
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
	public void setLow(Quantity newLow) {
		if (newLow != low) {
			NotificationChain msgs = null;
			if (low != null)
				msgs = ((InternalEObject)low).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			if (newLow != null)
				msgs = ((InternalEObject)newLow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW, null, msgs);
			msgs = basicSetLow(newLow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW, newLow, newLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getHigh() {
		return high;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigh(Quantity newHigh, NotificationChain msgs) {
		Quantity oldHigh = high;
		high = newHigh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH, oldHigh, newHigh);
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
	public void setHigh(Quantity newHigh) {
		if (newHigh != high) {
			NotificationChain msgs = null;
			if (high != null)
				msgs = ((InternalEObject)high).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			if (newHigh != null)
				msgs = ((InternalEObject)newHigh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH, null, msgs);
			msgs = basicSetHigh(newHigh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH, newHigh, newHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getNormalValue() {
		return normalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalValue(CodeableConcept newNormalValue, NotificationChain msgs) {
		CodeableConcept oldNormalValue = normalValue;
		normalValue = newNormalValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE, oldNormalValue, newNormalValue);
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
	public void setNormalValue(CodeableConcept newNormalValue) {
		if (newNormalValue != normalValue) {
			NotificationChain msgs = null;
			if (normalValue != null)
				msgs = ((InternalEObject)normalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE, null, msgs);
			if (newNormalValue != null)
				msgs = ((InternalEObject)newNormalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE, null, msgs);
			msgs = basicSetNormalValue(newNormalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE, newNormalValue, newNormalValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Range getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Range newAge, NotificationChain msgs) {
		Range oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE, oldAge, newAge);
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
	public void setAge(Range newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject)age).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject)newAge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE, newAge, newAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markdown getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Markdown newText, NotificationChain msgs) {
		Markdown oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT, oldText, newText);
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
	public void setText(Markdown newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return basicSetLow(null, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return basicSetHigh(null, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE:
				return basicSetNormalValue(null, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return basicSetType(null, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return ((InternalEList<?>)getAppliesTo()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return basicSetAge(null, msgs);
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return basicSetText(null, msgs);
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
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return getLow();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return getHigh();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE:
				return getNormalValue();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return getType();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return getAppliesTo();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return getAge();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return getText();
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
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE:
				setNormalValue((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)newValue);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((Markdown)newValue);
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
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				setLow((Quantity)null);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				setHigh((Quantity)null);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE:
				setNormalValue((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				setAge((Range)null);
				return;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				setText((Markdown)null);
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
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__LOW:
				return low != null;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__HIGH:
				return high != null;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__NORMAL_VALUE:
				return normalValue != null;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TYPE:
				return type != null;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__AGE:
				return age != null;
			case FHIRPackage.OBSERVATION_REFERENCE_RANGE__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //ObservationReferenceRangeImpl

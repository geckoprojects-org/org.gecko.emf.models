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
import org.hl7.fhir.Coding;
import org.hl7.fhir.FHIRPackage;
import org.hl7.fhir.ObservationDataType;
import org.hl7.fhir.ObservationDefinitionComponent;
import org.hl7.fhir.ObservationDefinitionQualifiedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observation Definition Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getPermittedDataType <em>Permitted Data Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getPermittedUnit <em>Permitted Unit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ObservationDefinitionComponentImpl#getQualifiedValue <em>Qualified Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservationDefinitionComponentImpl extends BackboneElementImpl implements ObservationDefinitionComponent {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getPermittedDataType() <em>Permitted Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDataType> permittedDataType;

	/**
	 * The cached value of the '{@link #getPermittedUnit() <em>Permitted Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> permittedUnit;

	/**
	 * The cached value of the '{@link #getQualifiedValue() <em>Qualified Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<ObservationDefinitionQualifiedValue> qualifiedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObservationDefinitionComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.eINSTANCE.getObservationDefinitionComponent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationDataType> getPermittedDataType() {
		if (permittedDataType == null) {
			permittedDataType = new EObjectContainmentEList<ObservationDataType>(ObservationDataType.class, this, FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE);
		}
		return permittedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getPermittedUnit() {
		if (permittedUnit == null) {
			permittedUnit = new EObjectContainmentEList<Coding>(Coding.class, this, FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT);
		}
		return permittedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ObservationDefinitionQualifiedValue> getQualifiedValue() {
		if (qualifiedValue == null) {
			qualifiedValue = new EObjectContainmentEList<ObservationDefinitionQualifiedValue>(ObservationDefinitionQualifiedValue.class, this, FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE);
		}
		return qualifiedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return basicSetCode(null, msgs);
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return ((InternalEList<?>)getPermittedDataType()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return ((InternalEList<?>)getPermittedUnit()).basicRemove(otherEnd, msgs);
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return ((InternalEList<?>)getQualifiedValue()).basicRemove(otherEnd, msgs);
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
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return getCode();
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return getPermittedDataType();
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return getPermittedUnit();
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return getQualifiedValue();
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
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				getPermittedDataType().addAll((Collection<? extends ObservationDataType>)newValue);
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				getPermittedUnit().clear();
				getPermittedUnit().addAll((Collection<? extends Coding>)newValue);
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				getQualifiedValue().clear();
				getQualifiedValue().addAll((Collection<? extends ObservationDefinitionQualifiedValue>)newValue);
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
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				setCode((CodeableConcept)null);
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				getPermittedDataType().clear();
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				getPermittedUnit().clear();
				return;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				getQualifiedValue().clear();
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
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__CODE:
				return code != null;
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_DATA_TYPE:
				return permittedDataType != null && !permittedDataType.isEmpty();
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__PERMITTED_UNIT:
				return permittedUnit != null && !permittedUnit.isEmpty();
			case FHIRPackage.OBSERVATION_DEFINITION_COMPONENT__QUALIFIED_VALUE:
				return qualifiedValue != null && !qualifiedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObservationDefinitionComponentImpl

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
package oasis.names.tc.ciq.xsdschema.xAL.impl;

import oasis.names.tc.ciq.xsdschema.xAL.DependentLocalityNumberType;
import oasis.names.tc.ciq.xsdschema.xAL.NameNumberOccurrenceType;
import oasis.names.tc.ciq.xsdschema.xAL.XALPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependent Locality Number Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl#getNameNumberOccurrence <em>Name Number Occurrence</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DependentLocalityNumberTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependentLocalityNumberTypeImpl extends MinimalEObjectImpl.Container implements DependentLocalityNumberType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final Object CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Object code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameNumberOccurrence() <em>Name Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNumberOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final NameNumberOccurrenceType NAME_NUMBER_OCCURRENCE_EDEFAULT = NameNumberOccurrenceType.BEFORE;

	/**
	 * The cached value of the '{@link #getNameNumberOccurrence() <em>Name Number Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameNumberOccurrence()
	 * @generated
	 * @ordered
	 */
	protected NameNumberOccurrenceType nameNumberOccurrence = NAME_NUMBER_OCCURRENCE_EDEFAULT;

	/**
	 * This is true if the Name Number Occurrence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameNumberOccurrenceESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependentLocalityNumberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XALPackage.eINSTANCE.getDependentLocalityNumberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(Object newCode) {
		Object oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNumberOccurrenceType getNameNumberOccurrence() {
		return nameNumberOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameNumberOccurrence(NameNumberOccurrenceType newNameNumberOccurrence) {
		NameNumberOccurrenceType oldNameNumberOccurrence = nameNumberOccurrence;
		nameNumberOccurrence = newNameNumberOccurrence == null ? NAME_NUMBER_OCCURRENCE_EDEFAULT : newNameNumberOccurrence;
		boolean oldNameNumberOccurrenceESet = nameNumberOccurrenceESet;
		nameNumberOccurrenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE, oldNameNumberOccurrence, nameNumberOccurrence, !oldNameNumberOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNameNumberOccurrence() {
		NameNumberOccurrenceType oldNameNumberOccurrence = nameNumberOccurrence;
		boolean oldNameNumberOccurrenceESet = nameNumberOccurrenceESet;
		nameNumberOccurrence = NAME_NUMBER_OCCURRENCE_EDEFAULT;
		nameNumberOccurrenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE, oldNameNumberOccurrence, NAME_NUMBER_OCCURRENCE_EDEFAULT, oldNameNumberOccurrenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNameNumberOccurrence() {
		return nameNumberOccurrenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__CODE:
				return getCode();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE:
				return getNameNumberOccurrence();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__CODE:
				setCode(newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE:
				setNameNumberOccurrence((NameNumberOccurrenceType)newValue);
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED:
				getMixed().clear();
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE:
				unsetNameNumberOccurrence();
				return;
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__NAME_NUMBER_OCCURRENCE:
				return isSetNameNumberOccurrence();
			case XALPackage.DEPENDENT_LOCALITY_NUMBER_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", code: ");
		result.append(code);
		result.append(", nameNumberOccurrence: ");
		if (nameNumberOccurrenceESet) result.append(nameNumberOccurrence); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DependentLocalityNumberTypeImpl

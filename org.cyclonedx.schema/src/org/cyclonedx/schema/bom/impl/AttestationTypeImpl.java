/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.AttestationType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.MapType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attestation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AttestationTypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AttestationTypeImpl#getAssessor <em>Assessor</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AttestationTypeImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AttestationTypeImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttestationTypeImpl extends MinimalEObjectImpl.Container implements AttestationType {
	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessor() <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessor() <em>Assessor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessor()
	 * @generated
	 * @ordered
	 */
	protected String assessor = ASSESSOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected EList<MapType> map;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttestationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAttestationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ATTESTATION_TYPE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessor() {
		return assessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessor(String newAssessor) {
		String oldAssessor = assessor;
		assessor = newAssessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ATTESTATION_TYPE__ASSESSOR, oldAssessor, assessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MapType> getMap() {
		if (map == null) {
			map = new EObjectContainmentEList<MapType>(MapType.class, this, BOMPackage.ATTESTATION_TYPE__MAP);
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.ATTESTATION_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ATTESTATION_TYPE__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case BOMPackage.ATTESTATION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BOMPackage.ATTESTATION_TYPE__SUMMARY:
				return getSummary();
			case BOMPackage.ATTESTATION_TYPE__ASSESSOR:
				return getAssessor();
			case BOMPackage.ATTESTATION_TYPE__MAP:
				return getMap();
			case BOMPackage.ATTESTATION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case BOMPackage.ATTESTATION_TYPE__SUMMARY:
				setSummary((String)newValue);
				return;
			case BOMPackage.ATTESTATION_TYPE__ASSESSOR:
				setAssessor((String)newValue);
				return;
			case BOMPackage.ATTESTATION_TYPE__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case BOMPackage.ATTESTATION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case BOMPackage.ATTESTATION_TYPE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case BOMPackage.ATTESTATION_TYPE__ASSESSOR:
				setAssessor(ASSESSOR_EDEFAULT);
				return;
			case BOMPackage.ATTESTATION_TYPE__MAP:
				getMap().clear();
				return;
			case BOMPackage.ATTESTATION_TYPE__ANY:
				getAny().clear();
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
			case BOMPackage.ATTESTATION_TYPE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case BOMPackage.ATTESTATION_TYPE__ASSESSOR:
				return ASSESSOR_EDEFAULT == null ? assessor != null : !ASSESSOR_EDEFAULT.equals(assessor);
			case BOMPackage.ATTESTATION_TYPE__MAP:
				return map != null && !map.isEmpty();
			case BOMPackage.ATTESTATION_TYPE__ANY:
				return any != null && !any.isEmpty();
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
		result.append(" (summary: ");
		result.append(summary);
		result.append(", assessor: ");
		result.append(assessor);
		result.append(", any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //AttestationTypeImpl

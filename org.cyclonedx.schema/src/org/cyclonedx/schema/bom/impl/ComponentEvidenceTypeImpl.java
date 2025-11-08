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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.CallstackType;
import org.cyclonedx.schema.bom.ComponentEvidenceType;
import org.cyclonedx.schema.bom.CopyrightsType;
import org.cyclonedx.schema.bom.IdentityType;
import org.cyclonedx.schema.bom.LicenseChoiceType;
import org.cyclonedx.schema.bom.OccurrencesType;

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
 * An implementation of the model object '<em><b>Component Evidence Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getOccurrences <em>Occurrences</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getCallstack <em>Callstack</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.ComponentEvidenceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentEvidenceTypeImpl extends MinimalEObjectImpl.Container implements ComponentEvidenceType {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentityType> identity;

	/**
	 * The cached value of the '{@link #getOccurrences() <em>Occurrences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrences()
	 * @generated
	 * @ordered
	 */
	protected OccurrencesType occurrences;

	/**
	 * The cached value of the '{@link #getCallstack() <em>Callstack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallstack()
	 * @generated
	 * @ordered
	 */
	protected CallstackType callstack;

	/**
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected LicenseChoiceType licenses;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected CopyrightsType copyright;

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
	protected ComponentEvidenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getComponentEvidenceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentityType> getIdentity() {
		if (identity == null) {
			identity = new EObjectContainmentEList<IdentityType>(IdentityType.class, this, BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY);
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrencesType getOccurrences() {
		return occurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrences(OccurrencesType newOccurrences, NotificationChain msgs) {
		OccurrencesType oldOccurrences = occurrences;
		occurrences = newOccurrences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES, oldOccurrences, newOccurrences);
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
	public void setOccurrences(OccurrencesType newOccurrences) {
		if (newOccurrences != occurrences) {
			NotificationChain msgs = null;
			if (occurrences != null)
				msgs = ((InternalEObject)occurrences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES, null, msgs);
			if (newOccurrences != null)
				msgs = ((InternalEObject)newOccurrences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES, null, msgs);
			msgs = basicSetOccurrences(newOccurrences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES, newOccurrences, newOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallstackType getCallstack() {
		return callstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallstack(CallstackType newCallstack, NotificationChain msgs) {
		CallstackType oldCallstack = callstack;
		callstack = newCallstack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK, oldCallstack, newCallstack);
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
	public void setCallstack(CallstackType newCallstack) {
		if (newCallstack != callstack) {
			NotificationChain msgs = null;
			if (callstack != null)
				msgs = ((InternalEObject)callstack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK, null, msgs);
			if (newCallstack != null)
				msgs = ((InternalEObject)newCallstack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK, null, msgs);
			msgs = basicSetCallstack(newCallstack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK, newCallstack, newCallstack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseChoiceType getLicenses() {
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenses(LicenseChoiceType newLicenses, NotificationChain msgs) {
		LicenseChoiceType oldLicenses = licenses;
		licenses = newLicenses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES, oldLicenses, newLicenses);
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
	public void setLicenses(LicenseChoiceType newLicenses) {
		if (newLicenses != licenses) {
			NotificationChain msgs = null;
			if (licenses != null)
				msgs = ((InternalEObject)licenses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES, null, msgs);
			if (newLicenses != null)
				msgs = ((InternalEObject)newLicenses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES, null, msgs);
			msgs = basicSetLicenses(newLicenses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES, newLicenses, newLicenses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightsType getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(CopyrightsType newCopyright, NotificationChain msgs) {
		CopyrightsType oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT, oldCopyright, newCopyright);
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
	public void setCopyright(CopyrightsType newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY:
				return ((InternalEList<?>)getIdentity()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES:
				return basicSetOccurrences(null, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK:
				return basicSetCallstack(null, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES:
				return basicSetLicenses(null, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY:
				return getIdentity();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES:
				return getOccurrences();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK:
				return getCallstack();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES:
				return getLicenses();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT:
				return getCopyright();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY:
				getIdentity().clear();
				getIdentity().addAll((Collection<? extends IdentityType>)newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES:
				setOccurrences((OccurrencesType)newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK:
				setCallstack((CallstackType)newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES:
				setLicenses((LicenseChoiceType)newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT:
				setCopyright((CopyrightsType)newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY:
				getIdentity().clear();
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES:
				setOccurrences((OccurrencesType)null);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK:
				setCallstack((CallstackType)null);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES:
				setLicenses((LicenseChoiceType)null);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT:
				setCopyright((CopyrightsType)null);
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__IDENTITY:
				return identity != null && !identity.isEmpty();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__OCCURRENCES:
				return occurrences != null;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__CALLSTACK:
				return callstack != null;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__LICENSES:
				return licenses != null;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__COPYRIGHT:
				return copyright != null;
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ComponentEvidenceTypeImpl

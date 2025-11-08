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

import org.cyclonedx.schema.bom.AssessorType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.OrganizationalEntity;

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
 * An implementation of the model object '<em><b>Assessor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AssessorTypeImpl#isThirdParty <em>Third Party</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AssessorTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AssessorTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.AssessorTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessorTypeImpl extends MinimalEObjectImpl.Container implements AssessorType {
	/**
	 * The default value of the '{@link #isThirdParty() <em>Third Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdParty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THIRD_PARTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThirdParty() <em>Third Party</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThirdParty()
	 * @generated
	 * @ordered
	 */
	protected boolean thirdParty = THIRD_PARTY_EDEFAULT;

	/**
	 * This is true if the Third Party attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thirdPartyESet;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected OrganizationalEntity organization;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

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
	protected AssessorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getAssessorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isThirdParty() {
		return thirdParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThirdParty(boolean newThirdParty) {
		boolean oldThirdParty = thirdParty;
		thirdParty = newThirdParty;
		boolean oldThirdPartyESet = thirdPartyESet;
		thirdPartyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ASSESSOR_TYPE__THIRD_PARTY, oldThirdParty, thirdParty, !oldThirdPartyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetThirdParty() {
		boolean oldThirdParty = thirdParty;
		boolean oldThirdPartyESet = thirdPartyESet;
		thirdParty = THIRD_PARTY_EDEFAULT;
		thirdPartyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ASSESSOR_TYPE__THIRD_PARTY, oldThirdParty, THIRD_PARTY_EDEFAULT, oldThirdPartyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetThirdParty() {
		return thirdPartyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(OrganizationalEntity newOrganization, NotificationChain msgs) {
		OrganizationalEntity oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ASSESSOR_TYPE__ORGANIZATION, oldOrganization, newOrganization);
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
	public void setOrganization(OrganizationalEntity newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ASSESSOR_TYPE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ASSESSOR_TYPE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ASSESSOR_TYPE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ASSESSOR_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.ASSESSOR_TYPE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.ASSESSOR_TYPE__THIRD_PARTY:
				return isThirdParty();
			case BOMPackage.ASSESSOR_TYPE__ORGANIZATION:
				return getOrganization();
			case BOMPackage.ASSESSOR_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.ASSESSOR_TYPE__THIRD_PARTY:
				setThirdParty((Boolean)newValue);
				return;
			case BOMPackage.ASSESSOR_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)newValue);
				return;
			case BOMPackage.ASSESSOR_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.ASSESSOR_TYPE__THIRD_PARTY:
				unsetThirdParty();
				return;
			case BOMPackage.ASSESSOR_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)null);
				return;
			case BOMPackage.ASSESSOR_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.ASSESSOR_TYPE__THIRD_PARTY:
				return isSetThirdParty();
			case BOMPackage.ASSESSOR_TYPE__ORGANIZATION:
				return organization != null;
			case BOMPackage.ASSESSOR_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.ASSESSOR_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (thirdParty: ");
		if (thirdPartyESet) result.append(thirdParty); else result.append("<unset>");
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //AssessorTypeImpl

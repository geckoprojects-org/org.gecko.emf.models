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

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.EnergyMeasureType;
import org.cyclonedx.schema.bom.EnergyProviderType;
import org.cyclonedx.schema.bom.EnergySourceType;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.OrganizationalEntity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Provider Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getEnergySource <em>Energy Source</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getEnergyProvided <em>Energy Provided</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyProviderTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyProviderTypeImpl extends MinimalEObjectImpl.Container implements EnergyProviderType {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getEnergySource() <em>Energy Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergySource()
	 * @generated
	 * @ordered
	 */
	protected static final EnergySourceType ENERGY_SOURCE_EDEFAULT = EnergySourceType.COAL;

	/**
	 * The cached value of the '{@link #getEnergySource() <em>Energy Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergySource()
	 * @generated
	 * @ordered
	 */
	protected EnergySourceType energySource = ENERGY_SOURCE_EDEFAULT;

	/**
	 * This is true if the Energy Source attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energySourceESet;

	/**
	 * The cached value of the '{@link #getEnergyProvided() <em>Energy Provided</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProvided()
	 * @generated
	 * @ordered
	 */
	protected EnergyMeasureType energyProvided;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyProviderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEnergyProviderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION, oldOrganization, newOrganization);
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
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergySourceType getEnergySource() {
		return energySource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnergySource(EnergySourceType newEnergySource) {
		EnergySourceType oldEnergySource = energySource;
		energySource = newEnergySource == null ? ENERGY_SOURCE_EDEFAULT : newEnergySource;
		boolean oldEnergySourceESet = energySourceESet;
		energySourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE, oldEnergySource, energySource, !oldEnergySourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEnergySource() {
		EnergySourceType oldEnergySource = energySource;
		boolean oldEnergySourceESet = energySourceESet;
		energySource = ENERGY_SOURCE_EDEFAULT;
		energySourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE, oldEnergySource, ENERGY_SOURCE_EDEFAULT, oldEnergySourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEnergySource() {
		return energySourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyMeasureType getEnergyProvided() {
		return energyProvided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergyProvided(EnergyMeasureType newEnergyProvided, NotificationChain msgs) {
		EnergyMeasureType oldEnergyProvided = energyProvided;
		energyProvided = newEnergyProvided;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED, oldEnergyProvided, newEnergyProvided);
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
	public void setEnergyProvided(EnergyMeasureType newEnergyProvided) {
		if (newEnergyProvided != energyProvided) {
			NotificationChain msgs = null;
			if (energyProvided != null)
				msgs = ((InternalEObject)energyProvided).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED, null, msgs);
			if (newEnergyProvided != null)
				msgs = ((InternalEObject)newEnergyProvided).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED, null, msgs);
			msgs = basicSetEnergyProvided(newEnergyProvided, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED, newEnergyProvided, newEnergyProvided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_PROVIDER_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED:
				return basicSetEnergyProvided(null, msgs);
			case BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
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
			case BOMPackage.ENERGY_PROVIDER_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION:
				return getOrganization();
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE:
				return getEnergySource();
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED:
				return getEnergyProvided();
			case BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.ENERGY_PROVIDER_TYPE__BOM_REF:
				return getBomRef();
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
			case BOMPackage.ENERGY_PROVIDER_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)newValue);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE:
				setEnergySource((EnergySourceType)newValue);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED:
				setEnergyProvided((EnergyMeasureType)newValue);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__BOM_REF:
				setBomRef((String)newValue);
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
			case BOMPackage.ENERGY_PROVIDER_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION:
				setOrganization((OrganizationalEntity)null);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE:
				unsetEnergySource();
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED:
				setEnergyProvided((EnergyMeasureType)null);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.ENERGY_PROVIDER_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
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
			case BOMPackage.ENERGY_PROVIDER_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BOMPackage.ENERGY_PROVIDER_TYPE__ORGANIZATION:
				return organization != null;
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_SOURCE:
				return isSetEnergySource();
			case BOMPackage.ENERGY_PROVIDER_TYPE__ENERGY_PROVIDED:
				return energyProvided != null;
			case BOMPackage.ENERGY_PROVIDER_TYPE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.ENERGY_PROVIDER_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
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
		result.append(" (description: ");
		result.append(description);
		result.append(", energySource: ");
		if (energySourceESet) result.append(energySource); else result.append("<unset>");
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(')');
		return result.toString();
	}

} //EnergyProviderTypeImpl

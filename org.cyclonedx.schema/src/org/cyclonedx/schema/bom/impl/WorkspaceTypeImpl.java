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

import org.cyclonedx.schema.bom.AccessModeEnum;
import org.cyclonedx.schema.bom.AliasesType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.ResourceReferencesType;
import org.cyclonedx.schema.bom.VolumeType;
import org.cyclonedx.schema.bom.WorkspaceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getAliases <em>Aliases</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getResourceReferences <em>Resource References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getManagedDataType <em>Managed Data Type</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getVolumeRequest <em>Volume Request</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.WorkspaceTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkspaceTypeImpl extends MinimalEObjectImpl.Container implements WorkspaceType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected WorkspaceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getWorkspaceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, BOMPackage.WORKSPACE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getUid() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Uid());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getName() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AliasesType> getAliases() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Aliases());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getDescription() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Description());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResourceReferencesType> getResourceReferences() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_ResourceReferences());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccessModeEnum> getAccessMode() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_AccessMode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMountPath() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_MountPath());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getManagedDataType() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_ManagedDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVolumeRequest() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_VolumeRequest());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VolumeType> getVolume() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Volume());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertiesType> getProperties() {
		return getGroup().list(BOMPackage.eINSTANCE.getWorkspaceType_Properties());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(BOMPackage.eINSTANCE.getWorkspaceType_Any());
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
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.WORKSPACE_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.WORKSPACE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__ALIASES:
				return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__RESOURCE_REFERENCES:
				return ((InternalEList<?>)getResourceReferences()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__VOLUME:
				return ((InternalEList<?>)getVolume()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.WORKSPACE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case BOMPackage.WORKSPACE_TYPE__UID:
				return getUid();
			case BOMPackage.WORKSPACE_TYPE__NAME:
				return getName();
			case BOMPackage.WORKSPACE_TYPE__ALIASES:
				return getAliases();
			case BOMPackage.WORKSPACE_TYPE__DESCRIPTION:
				return getDescription();
			case BOMPackage.WORKSPACE_TYPE__RESOURCE_REFERENCES:
				return getResourceReferences();
			case BOMPackage.WORKSPACE_TYPE__ACCESS_MODE:
				return getAccessMode();
			case BOMPackage.WORKSPACE_TYPE__MOUNT_PATH:
				return getMountPath();
			case BOMPackage.WORKSPACE_TYPE__MANAGED_DATA_TYPE:
				return getManagedDataType();
			case BOMPackage.WORKSPACE_TYPE__VOLUME_REQUEST:
				return getVolumeRequest();
			case BOMPackage.WORKSPACE_TYPE__VOLUME:
				return getVolume();
			case BOMPackage.WORKSPACE_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.WORKSPACE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BOMPackage.WORKSPACE_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.WORKSPACE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__UID:
				getUid().clear();
				getUid().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__ALIASES:
				getAliases().clear();
				getAliases().addAll((Collection<? extends AliasesType>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__RESOURCE_REFERENCES:
				getResourceReferences().clear();
				getResourceReferences().addAll((Collection<? extends ResourceReferencesType>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__ACCESS_MODE:
				getAccessMode().clear();
				getAccessMode().addAll((Collection<? extends AccessModeEnum>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__MOUNT_PATH:
				getMountPath().clear();
				getMountPath().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__MANAGED_DATA_TYPE:
				getManagedDataType().clear();
				getManagedDataType().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__VOLUME_REQUEST:
				getVolumeRequest().clear();
				getVolumeRequest().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__VOLUME:
				getVolume().clear();
				getVolume().addAll((Collection<? extends VolumeType>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertiesType>)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.WORKSPACE_TYPE__GROUP:
				getGroup().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__UID:
				getUid().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__NAME:
				getName().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__ALIASES:
				getAliases().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__DESCRIPTION:
				getDescription().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__RESOURCE_REFERENCES:
				getResourceReferences().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__ACCESS_MODE:
				getAccessMode().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__MOUNT_PATH:
				getMountPath().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__MANAGED_DATA_TYPE:
				getManagedDataType().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__VOLUME_REQUEST:
				getVolumeRequest().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__VOLUME:
				getVolume().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__PROPERTIES:
				getProperties().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__ANY:
				getAny().clear();
				return;
			case BOMPackage.WORKSPACE_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.WORKSPACE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case BOMPackage.WORKSPACE_TYPE__UID:
				return !getUid().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__NAME:
				return !getName().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__ALIASES:
				return !getAliases().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__DESCRIPTION:
				return !getDescription().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__RESOURCE_REFERENCES:
				return !getResourceReferences().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__ACCESS_MODE:
				return !getAccessMode().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__MOUNT_PATH:
				return !getMountPath().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__MANAGED_DATA_TYPE:
				return !getManagedDataType().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__VOLUME_REQUEST:
				return !getVolumeRequest().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__VOLUME:
				return !getVolume().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__PROPERTIES:
				return !getProperties().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__ANY:
				return !getAny().isEmpty();
			case BOMPackage.WORKSPACE_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.WORKSPACE_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //WorkspaceTypeImpl

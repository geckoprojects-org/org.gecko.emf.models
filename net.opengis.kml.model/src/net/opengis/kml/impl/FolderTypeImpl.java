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
package net.opengis.kml.impl;

import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.AbstractObjectType;
import net.opengis.kml.FolderType;
import net.opengis.kml.KMLPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getFolderSimpleExtensionGroupGroup <em>Folder Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getFolderObjectExtensionGroupGroup <em>Folder Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.FolderTypeImpl#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderTypeImpl extends AbstractContainerTypeImpl implements FolderType {
	/**
	 * The cached value of the '{@link #getAbstractFeatureGroupGroup() <em>Abstract Feature Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFeatureGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFeatureGroupGroup;

	/**
	 * The cached value of the '{@link #getFolderSimpleExtensionGroupGroup() <em>Folder Simple Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderSimpleExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap folderSimpleExtensionGroupGroup;

	/**
	 * The cached value of the '{@link #getFolderObjectExtensionGroupGroup() <em>Folder Object Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderObjectExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap folderObjectExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getFolderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractFeatureGroupGroup() {
		if (abstractFeatureGroupGroup == null) {
			abstractFeatureGroupGroup = new BasicFeatureMap(this, KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP);
		}
		return abstractFeatureGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFeatureType> getAbstractFeatureGroup() {
		return getAbstractFeatureGroupGroup().list(KMLPackage.eINSTANCE.getFolderType_AbstractFeatureGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFolderSimpleExtensionGroupGroup() {
		if (folderSimpleExtensionGroupGroup == null) {
			folderSimpleExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP);
		}
		return folderSimpleExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Object> getFolderSimpleExtensionGroup() {
		return getFolderSimpleExtensionGroupGroup().list(KMLPackage.eINSTANCE.getFolderType_FolderSimpleExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getFolderObjectExtensionGroupGroup() {
		if (folderObjectExtensionGroupGroup == null) {
			folderObjectExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP);
		}
		return folderObjectExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractObjectType> getFolderObjectExtensionGroup() {
		return getFolderObjectExtensionGroupGroup().list(KMLPackage.eINSTANCE.getFolderType_FolderObjectExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP:
				return ((InternalEList<?>)getAbstractFeatureGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getFolderSimpleExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getFolderObjectExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP:
				return ((InternalEList<?>)getFolderObjectExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				if (coreType) return getAbstractFeatureGroupGroup();
				return ((FeatureMap.Internal)getAbstractFeatureGroupGroup()).getWrapper();
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP:
				return getAbstractFeatureGroup();
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP:
				if (coreType) return getFolderSimpleExtensionGroupGroup();
				return ((FeatureMap.Internal)getFolderSimpleExtensionGroupGroup()).getWrapper();
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP:
				return getFolderSimpleExtensionGroup();
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP:
				if (coreType) return getFolderObjectExtensionGroupGroup();
				return ((FeatureMap.Internal)getFolderObjectExtensionGroupGroup()).getWrapper();
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP:
				return getFolderObjectExtensionGroup();
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
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				((FeatureMap.Internal)getAbstractFeatureGroupGroup()).set(newValue);
				return;
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getFolderSimpleExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getFolderObjectExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				getAbstractFeatureGroupGroup().clear();
				return;
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP:
				getFolderSimpleExtensionGroupGroup().clear();
				return;
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP:
				getFolderObjectExtensionGroupGroup().clear();
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
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP:
				return abstractFeatureGroupGroup != null && !abstractFeatureGroupGroup.isEmpty();
			case KMLPackage.FOLDER_TYPE__ABSTRACT_FEATURE_GROUP:
				return !getAbstractFeatureGroup().isEmpty();
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP:
				return folderSimpleExtensionGroupGroup != null && !folderSimpleExtensionGroupGroup.isEmpty();
			case KMLPackage.FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP:
				return !getFolderSimpleExtensionGroup().isEmpty();
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP:
				return folderObjectExtensionGroupGroup != null && !folderObjectExtensionGroupGroup.isEmpty();
			case KMLPackage.FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP:
				return !getFolderObjectExtensionGroup().isEmpty();
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
		result.append(" (abstractFeatureGroupGroup: ");
		result.append(abstractFeatureGroupGroup);
		result.append(", folderSimpleExtensionGroupGroup: ");
		result.append(folderSimpleExtensionGroupGroup);
		result.append(", folderObjectExtensionGroupGroup: ");
		result.append(folderObjectExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //FolderTypeImpl

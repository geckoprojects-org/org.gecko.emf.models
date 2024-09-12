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

import java.util.Collection;

import net.opengis.kml.ChangeType;
import net.opengis.kml.CreateType;
import net.opengis.kml.DeleteType;
import net.opengis.kml.KMLPackage;
import net.opengis.kml.UpdateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getChange <em>Change</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getUpdateOpExtensionGroupGroup <em>Update Op Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getUpdateExtensionGroupGroup <em>Update Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.impl.UpdateTypeImpl#getUpdateExtensionGroup <em>Update Extension Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateTypeImpl extends MinimalEObjectImpl.Container implements UpdateType {
	/**
	 * The default value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected String targetHref = TARGET_HREF_EDEFAULT;

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
	 * The cached value of the '{@link #getUpdateExtensionGroupGroup() <em>Update Extension Group Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateExtensionGroupGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap updateExtensionGroupGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KMLPackage.eINSTANCE.getUpdateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetHref() {
		return targetHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetHref(String newTargetHref) {
		String oldTargetHref = targetHref;
		targetHref = newTargetHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KMLPackage.UPDATE_TYPE__TARGET_HREF, oldTargetHref, targetHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, KMLPackage.UPDATE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CreateType> getCreate() {
		return getGroup().list(KMLPackage.eINSTANCE.getUpdateType_Create());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeleteType> getDelete() {
		return getGroup().list(KMLPackage.eINSTANCE.getUpdateType_Delete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChangeType> getChange() {
		return getGroup().list(KMLPackage.eINSTANCE.getUpdateType_Change());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUpdateOpExtensionGroupGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(KMLPackage.eINSTANCE.getUpdateType_UpdateOpExtensionGroupGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getUpdateOpExtensionGroup() {
		return getUpdateOpExtensionGroupGroup().list(KMLPackage.eINSTANCE.getUpdateType_UpdateOpExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getUpdateExtensionGroupGroup() {
		if (updateExtensionGroupGroup == null) {
			updateExtensionGroupGroup = new BasicFeatureMap(this, KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP);
		}
		return updateExtensionGroupGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getUpdateExtensionGroup() {
		return getUpdateExtensionGroupGroup().list(KMLPackage.eINSTANCE.getUpdateType_UpdateExtensionGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KMLPackage.UPDATE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__CREATE:
				return ((InternalEList<?>)getCreate()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__CHANGE:
				return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getUpdateOpExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP:
				return ((InternalEList<?>)getUpdateOpExtensionGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP:
				return ((InternalEList<?>)getUpdateExtensionGroupGroup()).basicRemove(otherEnd, msgs);
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP:
				return ((InternalEList<?>)getUpdateExtensionGroup()).basicRemove(otherEnd, msgs);
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
			case KMLPackage.UPDATE_TYPE__TARGET_HREF:
				return getTargetHref();
			case KMLPackage.UPDATE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case KMLPackage.UPDATE_TYPE__CREATE:
				return getCreate();
			case KMLPackage.UPDATE_TYPE__DELETE:
				return getDelete();
			case KMLPackage.UPDATE_TYPE__CHANGE:
				return getChange();
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP:
				if (coreType) return getUpdateOpExtensionGroupGroup();
				return ((FeatureMap.Internal)getUpdateOpExtensionGroupGroup()).getWrapper();
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP:
				return getUpdateOpExtensionGroup();
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP:
				if (coreType) return getUpdateExtensionGroupGroup();
				return ((FeatureMap.Internal)getUpdateExtensionGroupGroup()).getWrapper();
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP:
				return getUpdateExtensionGroup();
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
			case KMLPackage.UPDATE_TYPE__TARGET_HREF:
				setTargetHref((String)newValue);
				return;
			case KMLPackage.UPDATE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case KMLPackage.UPDATE_TYPE__CREATE:
				getCreate().clear();
				getCreate().addAll((Collection<? extends CreateType>)newValue);
				return;
			case KMLPackage.UPDATE_TYPE__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends DeleteType>)newValue);
				return;
			case KMLPackage.UPDATE_TYPE__CHANGE:
				getChange().clear();
				getChange().addAll((Collection<? extends ChangeType>)newValue);
				return;
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getUpdateOpExtensionGroupGroup()).set(newValue);
				return;
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP:
				((FeatureMap.Internal)getUpdateExtensionGroupGroup()).set(newValue);
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
			case KMLPackage.UPDATE_TYPE__TARGET_HREF:
				setTargetHref(TARGET_HREF_EDEFAULT);
				return;
			case KMLPackage.UPDATE_TYPE__GROUP:
				getGroup().clear();
				return;
			case KMLPackage.UPDATE_TYPE__CREATE:
				getCreate().clear();
				return;
			case KMLPackage.UPDATE_TYPE__DELETE:
				getDelete().clear();
				return;
			case KMLPackage.UPDATE_TYPE__CHANGE:
				getChange().clear();
				return;
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP:
				getUpdateOpExtensionGroupGroup().clear();
				return;
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP:
				getUpdateExtensionGroupGroup().clear();
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
			case KMLPackage.UPDATE_TYPE__TARGET_HREF:
				return TARGET_HREF_EDEFAULT == null ? targetHref != null : !TARGET_HREF_EDEFAULT.equals(targetHref);
			case KMLPackage.UPDATE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case KMLPackage.UPDATE_TYPE__CREATE:
				return !getCreate().isEmpty();
			case KMLPackage.UPDATE_TYPE__DELETE:
				return !getDelete().isEmpty();
			case KMLPackage.UPDATE_TYPE__CHANGE:
				return !getChange().isEmpty();
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP:
				return !getUpdateOpExtensionGroupGroup().isEmpty();
			case KMLPackage.UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP:
				return !getUpdateOpExtensionGroup().isEmpty();
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP:
				return updateExtensionGroupGroup != null && !updateExtensionGroupGroup.isEmpty();
			case KMLPackage.UPDATE_TYPE__UPDATE_EXTENSION_GROUP:
				return !getUpdateExtensionGroup().isEmpty();
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
		result.append(" (targetHref: ");
		result.append(targetHref);
		result.append(", group: ");
		result.append(group);
		result.append(", updateExtensionGroupGroup: ");
		result.append(updateExtensionGroupGroup);
		result.append(')');
		return result.toString();
	}

} //UpdateTypeImpl

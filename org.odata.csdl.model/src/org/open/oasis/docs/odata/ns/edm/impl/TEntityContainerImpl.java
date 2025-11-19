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
package org.open.oasis.docs.odata.ns.edm.impl;

import java.util.Collection;

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

import org.open.oasis.docs.odata.ns.edm.AnnotationType;
import org.open.oasis.docs.odata.ns.edm.EdmPackage;
import org.open.oasis.docs.odata.ns.edm.TActionImport;
import org.open.oasis.docs.odata.ns.edm.TEntityContainer;
import org.open.oasis.docs.odata.ns.edm.TEntitySet;
import org.open.oasis.docs.odata.ns.edm.TFunctionImport;
import org.open.oasis.docs.odata.ns.edm.TSingleton;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEntity Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getEntitySet <em>Entity Set</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getActionImport <em>Action Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getFunctionImport <em>Function Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getSingleton <em>Singleton</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEntityContainerImpl extends MinimalEObjectImpl.Container implements TEntityContainer {
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
	 * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected String extends_ = EXTENDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntityContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTEntityContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TENTITY_CONTAINER__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TEntitySet> getEntitySet() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntityContainer_EntitySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TActionImport> getActionImport() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntityContainer_ActionImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TFunctionImport> getFunctionImport() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntityContainer_FunctionImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TSingleton> getSingleton() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntityContainer_Singleton());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTEntityContainer_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(String newExtends) {
		String oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENTITY_CONTAINER__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TENTITY_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TENTITY_CONTAINER__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_CONTAINER__ENTITY_SET:
				return ((InternalEList<?>)getEntitySet()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_CONTAINER__ACTION_IMPORT:
				return ((InternalEList<?>)getActionImport()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_CONTAINER__FUNCTION_IMPORT:
				return ((InternalEList<?>)getFunctionImport()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_CONTAINER__SINGLETON:
				return ((InternalEList<?>)getSingleton()).basicRemove(otherEnd, msgs);
			case EdmPackage.TENTITY_CONTAINER__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TENTITY_CONTAINER__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TENTITY_CONTAINER__ENTITY_SET:
				return getEntitySet();
			case EdmPackage.TENTITY_CONTAINER__ACTION_IMPORT:
				return getActionImport();
			case EdmPackage.TENTITY_CONTAINER__FUNCTION_IMPORT:
				return getFunctionImport();
			case EdmPackage.TENTITY_CONTAINER__SINGLETON:
				return getSingleton();
			case EdmPackage.TENTITY_CONTAINER__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TENTITY_CONTAINER__EXTENDS:
				return getExtends();
			case EdmPackage.TENTITY_CONTAINER__NAME:
				return getName();
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
			case EdmPackage.TENTITY_CONTAINER__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__ENTITY_SET:
				getEntitySet().clear();
				getEntitySet().addAll((Collection<? extends TEntitySet>)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__ACTION_IMPORT:
				getActionImport().clear();
				getActionImport().addAll((Collection<? extends TActionImport>)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__FUNCTION_IMPORT:
				getFunctionImport().clear();
				getFunctionImport().addAll((Collection<? extends TFunctionImport>)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__SINGLETON:
				getSingleton().clear();
				getSingleton().addAll((Collection<? extends TSingleton>)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__EXTENDS:
				setExtends((String)newValue);
				return;
			case EdmPackage.TENTITY_CONTAINER__NAME:
				setName((String)newValue);
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
			case EdmPackage.TENTITY_CONTAINER__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__ENTITY_SET:
				getEntitySet().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__ACTION_IMPORT:
				getActionImport().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__FUNCTION_IMPORT:
				getFunctionImport().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__SINGLETON:
				getSingleton().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TENTITY_CONTAINER__EXTENDS:
				setExtends(EXTENDS_EDEFAULT);
				return;
			case EdmPackage.TENTITY_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
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
			case EdmPackage.TENTITY_CONTAINER__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TENTITY_CONTAINER__ENTITY_SET:
				return !getEntitySet().isEmpty();
			case EdmPackage.TENTITY_CONTAINER__ACTION_IMPORT:
				return !getActionImport().isEmpty();
			case EdmPackage.TENTITY_CONTAINER__FUNCTION_IMPORT:
				return !getFunctionImport().isEmpty();
			case EdmPackage.TENTITY_CONTAINER__SINGLETON:
				return !getSingleton().isEmpty();
			case EdmPackage.TENTITY_CONTAINER__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TENTITY_CONTAINER__EXTENDS:
				return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
			case EdmPackage.TENTITY_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", extends: ");
		result.append(extends_);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TEntityContainerImpl

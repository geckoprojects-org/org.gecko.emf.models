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
import org.open.oasis.docs.odata.ns.edm.TAction;
import org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter;
import org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TAction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getEntitySetPath <em>Entity Set Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#isIsBound <em>Is Bound</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TActionImpl extends MinimalEObjectImpl.Container implements TAction {
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
	 * The default value of the '{@link #getEntitySetPath() <em>Entity Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySetPath()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_SET_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntitySetPath() <em>Entity Set Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntitySetPath()
	 * @generated
	 * @ordered
	 */
	protected String entitySetPath = ENTITY_SET_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsBound() <em>Is Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBound()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBound() <em>Is Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBound()
	 * @generated
	 * @ordered
	 */
	protected boolean isBound = IS_BOUND_EDEFAULT;

	/**
	 * This is true if the Is Bound attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBoundESet;

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
	protected TActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TACTION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TActionFunctionParameter> getParameter() {
		return getGroup().list(EdmPackage.eINSTANCE.getTAction_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTAction_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TActionFunctionReturnType> getReturnType() {
		return getGroup().list(EdmPackage.eINSTANCE.getTAction_ReturnType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntitySetPath() {
		return entitySetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntitySetPath(String newEntitySetPath) {
		String oldEntitySetPath = entitySetPath;
		entitySetPath = newEntitySetPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TACTION__ENTITY_SET_PATH, oldEntitySetPath, entitySetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsBound() {
		return isBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsBound(boolean newIsBound) {
		boolean oldIsBound = isBound;
		isBound = newIsBound;
		boolean oldIsBoundESet = isBoundESet;
		isBoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TACTION__IS_BOUND, oldIsBound, isBound, !oldIsBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsBound() {
		boolean oldIsBound = isBound;
		boolean oldIsBoundESet = isBoundESet;
		isBound = IS_BOUND_EDEFAULT;
		isBoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TACTION__IS_BOUND, oldIsBound, IS_BOUND_EDEFAULT, oldIsBoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsBound() {
		return isBoundESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TACTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TACTION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case EdmPackage.TACTION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TACTION__RETURN_TYPE:
				return ((InternalEList<?>)getReturnType()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TACTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TACTION__PARAMETER:
				return getParameter();
			case EdmPackage.TACTION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TACTION__RETURN_TYPE:
				return getReturnType();
			case EdmPackage.TACTION__ENTITY_SET_PATH:
				return getEntitySetPath();
			case EdmPackage.TACTION__IS_BOUND:
				return isIsBound();
			case EdmPackage.TACTION__NAME:
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
			case EdmPackage.TACTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TACTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TActionFunctionParameter>)newValue);
				return;
			case EdmPackage.TACTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TACTION__RETURN_TYPE:
				getReturnType().clear();
				getReturnType().addAll((Collection<? extends TActionFunctionReturnType>)newValue);
				return;
			case EdmPackage.TACTION__ENTITY_SET_PATH:
				setEntitySetPath((String)newValue);
				return;
			case EdmPackage.TACTION__IS_BOUND:
				setIsBound((Boolean)newValue);
				return;
			case EdmPackage.TACTION__NAME:
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
			case EdmPackage.TACTION__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TACTION__PARAMETER:
				getParameter().clear();
				return;
			case EdmPackage.TACTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TACTION__RETURN_TYPE:
				getReturnType().clear();
				return;
			case EdmPackage.TACTION__ENTITY_SET_PATH:
				setEntitySetPath(ENTITY_SET_PATH_EDEFAULT);
				return;
			case EdmPackage.TACTION__IS_BOUND:
				unsetIsBound();
				return;
			case EdmPackage.TACTION__NAME:
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
			case EdmPackage.TACTION__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TACTION__PARAMETER:
				return !getParameter().isEmpty();
			case EdmPackage.TACTION__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TACTION__RETURN_TYPE:
				return !getReturnType().isEmpty();
			case EdmPackage.TACTION__ENTITY_SET_PATH:
				return ENTITY_SET_PATH_EDEFAULT == null ? entitySetPath != null : !ENTITY_SET_PATH_EDEFAULT.equals(entitySetPath);
			case EdmPackage.TACTION__IS_BOUND:
				return isSetIsBound();
			case EdmPackage.TACTION__NAME:
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
		result.append(", entitySetPath: ");
		result.append(entitySetPath);
		result.append(", isBound: ");
		if (isBoundESet) result.append(isBound); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TActionImpl

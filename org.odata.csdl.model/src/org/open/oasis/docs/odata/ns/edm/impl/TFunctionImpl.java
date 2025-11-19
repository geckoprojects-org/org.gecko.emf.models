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
import org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter;
import org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType;
import org.open.oasis.docs.odata.ns.edm.TFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getEntitySetPath <em>Entity Set Path</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#isIsBound <em>Is Bound</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#isIsComposable <em>Is Composable</em>}</li>
 *   <li>{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TFunctionImpl extends MinimalEObjectImpl.Container implements TFunction {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TActionFunctionReturnType returnType;

	/**
	 * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup1()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group1;

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
	 * The default value of the '{@link #isIsComposable() <em>Is Composable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposable() <em>Is Composable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposable()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposable = IS_COMPOSABLE_EDEFAULT;

	/**
	 * This is true if the Is Composable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isComposableESet;

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
	protected TFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdmPackage.eINSTANCE.getTFunction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, EdmPackage.TFUNCTION__GROUP);
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
		return getGroup().list(EdmPackage.eINSTANCE.getTFunction_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation() {
		return getGroup().list(EdmPackage.eINSTANCE.getTFunction_Annotation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TActionFunctionReturnType getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TActionFunctionReturnType newReturnType, NotificationChain msgs) {
		TActionFunctionReturnType oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
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
	public void setReturnType(TActionFunctionReturnType newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TFUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EdmPackage.TFUNCTION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup1() {
		if (group1 == null) {
			group1 = new BasicFeatureMap(this, EdmPackage.TFUNCTION__GROUP1);
		}
		return group1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnotationType> getAnnotation1() {
		return getGroup1().list(EdmPackage.eINSTANCE.getTFunction_Annotation1());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__ENTITY_SET_PATH, oldEntitySetPath, entitySetPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__IS_BOUND, oldIsBound, isBound, !oldIsBoundESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TFUNCTION__IS_BOUND, oldIsBound, IS_BOUND_EDEFAULT, oldIsBoundESet));
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
	public boolean isIsComposable() {
		return isComposable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposable(boolean newIsComposable) {
		boolean oldIsComposable = isComposable;
		isComposable = newIsComposable;
		boolean oldIsComposableESet = isComposableESet;
		isComposableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__IS_COMPOSABLE, oldIsComposable, isComposable, !oldIsComposableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIsComposable() {
		boolean oldIsComposable = isComposable;
		boolean oldIsComposableESet = isComposableESet;
		isComposable = IS_COMPOSABLE_EDEFAULT;
		isComposableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EdmPackage.TFUNCTION__IS_COMPOSABLE, oldIsComposable, IS_COMPOSABLE_EDEFAULT, oldIsComposableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIsComposable() {
		return isComposableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdmPackage.TFUNCTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdmPackage.TFUNCTION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdmPackage.TFUNCTION__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case EdmPackage.TFUNCTION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case EdmPackage.TFUNCTION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case EdmPackage.TFUNCTION__GROUP1:
				return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
			case EdmPackage.TFUNCTION__ANNOTATION1:
				return ((InternalEList<?>)getAnnotation1()).basicRemove(otherEnd, msgs);
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
			case EdmPackage.TFUNCTION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdmPackage.TFUNCTION__PARAMETER:
				return getParameter();
			case EdmPackage.TFUNCTION__ANNOTATION:
				return getAnnotation();
			case EdmPackage.TFUNCTION__RETURN_TYPE:
				return getReturnType();
			case EdmPackage.TFUNCTION__GROUP1:
				if (coreType) return getGroup1();
				return ((FeatureMap.Internal)getGroup1()).getWrapper();
			case EdmPackage.TFUNCTION__ANNOTATION1:
				return getAnnotation1();
			case EdmPackage.TFUNCTION__ENTITY_SET_PATH:
				return getEntitySetPath();
			case EdmPackage.TFUNCTION__IS_BOUND:
				return isIsBound();
			case EdmPackage.TFUNCTION__IS_COMPOSABLE:
				return isIsComposable();
			case EdmPackage.TFUNCTION__NAME:
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
			case EdmPackage.TFUNCTION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdmPackage.TFUNCTION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TActionFunctionParameter>)newValue);
				return;
			case EdmPackage.TFUNCTION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TFUNCTION__RETURN_TYPE:
				setReturnType((TActionFunctionReturnType)newValue);
				return;
			case EdmPackage.TFUNCTION__GROUP1:
				((FeatureMap.Internal)getGroup1()).set(newValue);
				return;
			case EdmPackage.TFUNCTION__ANNOTATION1:
				getAnnotation1().clear();
				getAnnotation1().addAll((Collection<? extends AnnotationType>)newValue);
				return;
			case EdmPackage.TFUNCTION__ENTITY_SET_PATH:
				setEntitySetPath((String)newValue);
				return;
			case EdmPackage.TFUNCTION__IS_BOUND:
				setIsBound((Boolean)newValue);
				return;
			case EdmPackage.TFUNCTION__IS_COMPOSABLE:
				setIsComposable((Boolean)newValue);
				return;
			case EdmPackage.TFUNCTION__NAME:
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
			case EdmPackage.TFUNCTION__GROUP:
				getGroup().clear();
				return;
			case EdmPackage.TFUNCTION__PARAMETER:
				getParameter().clear();
				return;
			case EdmPackage.TFUNCTION__ANNOTATION:
				getAnnotation().clear();
				return;
			case EdmPackage.TFUNCTION__RETURN_TYPE:
				setReturnType((TActionFunctionReturnType)null);
				return;
			case EdmPackage.TFUNCTION__GROUP1:
				getGroup1().clear();
				return;
			case EdmPackage.TFUNCTION__ANNOTATION1:
				getAnnotation1().clear();
				return;
			case EdmPackage.TFUNCTION__ENTITY_SET_PATH:
				setEntitySetPath(ENTITY_SET_PATH_EDEFAULT);
				return;
			case EdmPackage.TFUNCTION__IS_BOUND:
				unsetIsBound();
				return;
			case EdmPackage.TFUNCTION__IS_COMPOSABLE:
				unsetIsComposable();
				return;
			case EdmPackage.TFUNCTION__NAME:
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
			case EdmPackage.TFUNCTION__GROUP:
				return group != null && !group.isEmpty();
			case EdmPackage.TFUNCTION__PARAMETER:
				return !getParameter().isEmpty();
			case EdmPackage.TFUNCTION__ANNOTATION:
				return !getAnnotation().isEmpty();
			case EdmPackage.TFUNCTION__RETURN_TYPE:
				return returnType != null;
			case EdmPackage.TFUNCTION__GROUP1:
				return group1 != null && !group1.isEmpty();
			case EdmPackage.TFUNCTION__ANNOTATION1:
				return !getAnnotation1().isEmpty();
			case EdmPackage.TFUNCTION__ENTITY_SET_PATH:
				return ENTITY_SET_PATH_EDEFAULT == null ? entitySetPath != null : !ENTITY_SET_PATH_EDEFAULT.equals(entitySetPath);
			case EdmPackage.TFUNCTION__IS_BOUND:
				return isSetIsBound();
			case EdmPackage.TFUNCTION__IS_COMPOSABLE:
				return isSetIsComposable();
			case EdmPackage.TFUNCTION__NAME:
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
		result.append(", group1: ");
		result.append(group1);
		result.append(", entitySetPath: ");
		result.append(entitySetPath);
		result.append(", isBound: ");
		if (isBoundESet) result.append(isBound); else result.append("<unset>");
		result.append(", isComposable: ");
		if (isComposableESet) result.append(isComposable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TFunctionImpl

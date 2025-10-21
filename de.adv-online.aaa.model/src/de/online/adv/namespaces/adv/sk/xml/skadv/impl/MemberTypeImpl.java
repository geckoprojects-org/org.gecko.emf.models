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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.MemberType;
import de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.MemberTypeImpl#getSimpleGraphicGroup <em>Simple Graphic Group</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.MemberTypeImpl#getSimpleGraphic <em>Simple Graphic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberTypeImpl extends MinimalEObjectImpl.Container implements MemberType {
	/**
	 * The cached value of the '{@link #getSimpleGraphicGroup() <em>Simple Graphic Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleGraphicGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap simpleGraphicGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getMemberType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getSimpleGraphicGroup() {
		if (simpleGraphicGroup == null) {
			simpleGraphicGroup = new BasicFeatureMap(this, AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP);
		}
		return simpleGraphicGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleGraphicType getSimpleGraphic() {
		return (SimpleGraphicType)getSimpleGraphicGroup().get(AAAPackage.eINSTANCE.getMemberType_SimpleGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleGraphic(SimpleGraphicType newSimpleGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getSimpleGraphicGroup()).basicAdd(AAAPackage.eINSTANCE.getMemberType_SimpleGraphic(), newSimpleGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP:
				return ((InternalEList<?>)getSimpleGraphicGroup()).basicRemove(otherEnd, msgs);
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC:
				return basicSetSimpleGraphic(null, msgs);
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
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP:
				if (coreType) return getSimpleGraphicGroup();
				return ((FeatureMap.Internal)getSimpleGraphicGroup()).getWrapper();
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC:
				return getSimpleGraphic();
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
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP:
				((FeatureMap.Internal)getSimpleGraphicGroup()).set(newValue);
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
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP:
				getSimpleGraphicGroup().clear();
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
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC_GROUP:
				return simpleGraphicGroup != null && !simpleGraphicGroup.isEmpty();
			case AAAPackage.MEMBER_TYPE__SIMPLE_GRAPHIC:
				return getSimpleGraphic() != null;
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
		result.append(" (simpleGraphicGroup: ");
		result.append(simpleGraphicGroup);
		result.append(')');
		return result.toString();
	}

} //MemberTypeImpl

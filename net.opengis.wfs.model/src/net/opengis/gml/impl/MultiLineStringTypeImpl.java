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
package net.opengis.gml.impl;

import java.util.Collection;

import net.opengis.gml.GMLPackage;
import net.opengis.gml.LineStringPropertyType;
import net.opengis.gml.MultiLineStringType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Line String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.MultiLineStringTypeImpl#getLineStringMember <em>Line String Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiLineStringTypeImpl extends AbstractGeometricAggregateTypeImpl implements MultiLineStringType {
	/**
	 * The cached value of the '{@link #getLineStringMember() <em>Line String Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStringMember()
	 * @generated
	 * @ordered
	 */
	protected EList<LineStringPropertyType> lineStringMember;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiLineStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getMultiLineStringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LineStringPropertyType> getLineStringMember() {
		if (lineStringMember == null) {
			lineStringMember = new EObjectContainmentEList<LineStringPropertyType>(LineStringPropertyType.class, this, GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER);
		}
		return lineStringMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER:
				return ((InternalEList<?>)getLineStringMember()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER:
				return getLineStringMember();
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
			case GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER:
				getLineStringMember().clear();
				getLineStringMember().addAll((Collection<? extends LineStringPropertyType>)newValue);
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
			case GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER:
				getLineStringMember().clear();
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
			case GMLPackage.MULTI_LINE_STRING_TYPE__LINE_STRING_MEMBER:
				return lineStringMember != null && !lineStringMember.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MultiLineStringTypeImpl

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

import net.opengis.gml.CodeType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.PrimeMeridianBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prime Meridian Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.PrimeMeridianBaseTypeImpl#getMeridianName <em>Meridian Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PrimeMeridianBaseTypeImpl extends DefinitionTypeImpl implements PrimeMeridianBaseType {
	/**
	 * The cached value of the '{@link #getMeridianName() <em>Meridian Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeridianName()
	 * @generated
	 * @ordered
	 */
	protected CodeType meridianName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimeMeridianBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getPrimeMeridianBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getMeridianName() {
		return meridianName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeridianName(CodeType newMeridianName, NotificationChain msgs) {
		CodeType oldMeridianName = meridianName;
		meridianName = newMeridianName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME, oldMeridianName, newMeridianName);
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
	public void setMeridianName(CodeType newMeridianName) {
		if (newMeridianName != meridianName) {
			NotificationChain msgs = null;
			if (meridianName != null)
				msgs = ((InternalEObject)meridianName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME, null, msgs);
			if (newMeridianName != null)
				msgs = ((InternalEObject)newMeridianName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME, null, msgs);
			msgs = basicSetMeridianName(newMeridianName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME, newMeridianName, newMeridianName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME:
				return basicSetMeridianName(null, msgs);
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
			case GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME:
				return getMeridianName();
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
			case GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME:
				setMeridianName((CodeType)newValue);
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
			case GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME:
				setMeridianName((CodeType)null);
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
			case GMLPackage.PRIME_MERIDIAN_BASE_TYPE__MERIDIAN_NAME:
				return meridianName != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimeMeridianBaseTypeImpl

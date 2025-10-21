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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auslandsanschrift Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl#getStaat <em>Staat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl#getAnschriftszeile <em>Anschriftszeile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuslandsanschriftTypeImpl extends MinimalEObjectImpl.Container implements AuslandsanschriftType {
	/**
	 * The cached value of the '{@link #getStaat() <em>Staat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaat()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatType staat;

	/**
	 * The cached value of the '{@link #getAnschriftszeile() <em>Anschriftszeile</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftszeile()
	 * @generated
	 * @ordered
	 */
	protected EList<String> anschriftszeile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuslandsanschriftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.AUSLANDSANSCHRIFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatType getStaat() {
		return staat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaat(CodeStaatType newStaat, NotificationChain msgs) {
		CodeStaatType oldStaat = staat;
		staat = newStaat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT, oldStaat, newStaat);
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
	public void setStaat(CodeStaatType newStaat) {
		if (newStaat != staat) {
			NotificationChain msgs = null;
			if (staat != null)
				msgs = ((InternalEObject)staat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT, null, msgs);
			if (newStaat != null)
				msgs = ((InternalEObject)newStaat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT, null, msgs);
			msgs = basicSetStaat(newStaat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT, newStaat, newStaat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAnschriftszeile() {
		if (anschriftszeile == null) {
			anschriftszeile = new EDataTypeEList<String>(String.class, this, BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE);
		}
		return anschriftszeile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT:
				return basicSetStaat(null, msgs);
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
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT:
				return getStaat();
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE:
				return getAnschriftszeile();
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
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT:
				setStaat((CodeStaatType)newValue);
				return;
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE:
				getAnschriftszeile().clear();
				getAnschriftszeile().addAll((Collection<? extends String>)newValue);
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
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT:
				setStaat((CodeStaatType)null);
				return;
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE:
				getAnschriftszeile().clear();
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
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__STAAT:
				return staat != null;
			case BaukastenPackage.AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE:
				return anschriftszeile != null && !anschriftszeile.isEmpty();
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
		result.append(" (anschriftszeile: ");
		result.append(anschriftszeile);
		result.append(')');
		return result.toString();
	}

} //AuslandsanschriftTypeImpl

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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.RueckweisendeStelleType;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rueckweisende Stelle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl#getPruefinstanz <em>Pruefinstanz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.RueckweisendeStelleTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RueckweisendeStelleTypeImpl extends MinimalEObjectImpl.Container implements RueckweisendeStelleType {
	/**
	 * The default value of the '{@link #getPruefinstanz() <em>Pruefinstanz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefinstanz()
	 * @generated
	 * @ordered
	 */
	protected static final String PRUEFINSTANZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPruefinstanz() <em>Pruefinstanz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefinstanz()
	 * @generated
	 * @ordered
	 */
	protected String pruefinstanz = PRUEFINSTANZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> erreichbarkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RueckweisendeStelleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AllgemeineNachrichtenPackage.Literals.RUECKWEISENDE_STELLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPruefinstanz() {
		return pruefinstanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPruefinstanz(String newPruefinstanz) {
		String oldPruefinstanz = pruefinstanz;
		pruefinstanz = newPruefinstanz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ, oldPruefinstanz, pruefinstanz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
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
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ:
				return getPruefinstanz();
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
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
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ:
				setPruefinstanz((String)newValue);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
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
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ:
				setPruefinstanz(PRUEFINSTANZ_EDEFAULT);
				return;
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
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
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__PRUEFINSTANZ:
				return PRUEFINSTANZ_EDEFAULT == null ? pruefinstanz != null : !PRUEFINSTANZ_EDEFAULT.equals(pruefinstanz);
			case AllgemeineNachrichtenPackage.RUECKWEISENDE_STELLE_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
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
		result.append(" (pruefinstanz: ");
		result.append(pruefinstanz);
		result.append(')');
		return result.toString();
	}

} //RueckweisendeStelleTypeImpl

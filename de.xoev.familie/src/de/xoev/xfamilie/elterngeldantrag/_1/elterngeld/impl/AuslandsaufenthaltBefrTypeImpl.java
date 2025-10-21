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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltBefrType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AuslandsaufenthaltType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auslandsaufenthalt Befr Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltBefrTypeImpl#getBefristeterAufenthalt <em>Befristeter Aufenthalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AuslandsaufenthaltBefrTypeImpl#getEndeAufenthalt <em>Ende Aufenthalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuslandsaufenthaltBefrTypeImpl extends MinimalEObjectImpl.Container implements AuslandsaufenthaltBefrType {
	/**
	 * The cached value of the '{@link #getBefristeterAufenthalt() <em>Befristeter Aufenthalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefristeterAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected AuslandsaufenthaltType befristeterAufenthalt;

	/**
	 * The default value of the '{@link #getEndeAufenthalt() <em>Ende Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndeAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENDE_AUFENTHALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndeAufenthalt() <em>Ende Aufenthalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndeAufenthalt()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endeAufenthalt = ENDE_AUFENTHALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuslandsaufenthaltBefrTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAuslandsaufenthaltBefrType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsaufenthaltType getBefristeterAufenthalt() {
		return befristeterAufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefristeterAufenthalt(AuslandsaufenthaltType newBefristeterAufenthalt, NotificationChain msgs) {
		AuslandsaufenthaltType oldBefristeterAufenthalt = befristeterAufenthalt;
		befristeterAufenthalt = newBefristeterAufenthalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT, oldBefristeterAufenthalt, newBefristeterAufenthalt);
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
	public void setBefristeterAufenthalt(AuslandsaufenthaltType newBefristeterAufenthalt) {
		if (newBefristeterAufenthalt != befristeterAufenthalt) {
			NotificationChain msgs = null;
			if (befristeterAufenthalt != null)
				msgs = ((InternalEObject)befristeterAufenthalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT, null, msgs);
			if (newBefristeterAufenthalt != null)
				msgs = ((InternalEObject)newBefristeterAufenthalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT, null, msgs);
			msgs = basicSetBefristeterAufenthalt(newBefristeterAufenthalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT, newBefristeterAufenthalt, newBefristeterAufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEndeAufenthalt() {
		return endeAufenthalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndeAufenthalt(XMLGregorianCalendar newEndeAufenthalt) {
		XMLGregorianCalendar oldEndeAufenthalt = endeAufenthalt;
		endeAufenthalt = newEndeAufenthalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT, oldEndeAufenthalt, endeAufenthalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT:
				return basicSetBefristeterAufenthalt(null, msgs);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT:
				return getBefristeterAufenthalt();
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT:
				return getEndeAufenthalt();
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT:
				setBefristeterAufenthalt((AuslandsaufenthaltType)newValue);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT:
				setEndeAufenthalt((XMLGregorianCalendar)newValue);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT:
				setBefristeterAufenthalt((AuslandsaufenthaltType)null);
				return;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT:
				setEndeAufenthalt(ENDE_AUFENTHALT_EDEFAULT);
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
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__BEFRISTETER_AUFENTHALT:
				return befristeterAufenthalt != null;
			case ElterngeldPackage.AUSLANDSAUFENTHALT_BEFR_TYPE__ENDE_AUFENTHALT:
				return ENDE_AUFENTHALT_EDEFAULT == null ? endeAufenthalt != null : !ENDE_AUFENTHALT_EDEFAULT.equals(endeAufenthalt);
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
		result.append(" (endeAufenthalt: ");
		result.append(endeAufenthalt);
		result.append(')');
		return result.toString();
	}

} //AuslandsaufenthaltBefrTypeImpl

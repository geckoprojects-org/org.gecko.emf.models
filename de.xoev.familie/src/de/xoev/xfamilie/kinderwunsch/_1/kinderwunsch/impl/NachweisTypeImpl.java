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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl#isNachweisVorhanden <em>Nachweis Vorhanden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweisTypeImpl extends MinimalEObjectImpl.Container implements NachweisType {
	/**
	 * The default value of the '{@link #isNachweisVorhanden() <em>Nachweis Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNachweisVorhanden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NACHWEIS_VORHANDEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNachweisVorhanden() <em>Nachweis Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNachweisVorhanden()
	 * @generated
	 * @ordered
	 */
	protected boolean nachweisVorhanden = NACHWEIS_VORHANDEN_EDEFAULT;

	/**
	 * This is true if the Nachweis Vorhanden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nachweisVorhandenESet;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.NACHWEIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNachweisVorhanden() {
		return nachweisVorhanden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachweisVorhanden(boolean newNachweisVorhanden) {
		boolean oldNachweisVorhanden = nachweisVorhanden;
		nachweisVorhanden = newNachweisVorhanden;
		boolean oldNachweisVorhandenESet = nachweisVorhandenESet;
		nachweisVorhandenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN, oldNachweisVorhanden, nachweisVorhanden, !oldNachweisVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNachweisVorhanden() {
		boolean oldNachweisVorhanden = nachweisVorhanden;
		boolean oldNachweisVorhandenESet = nachweisVorhandenESet;
		nachweisVorhanden = NACHWEIS_VORHANDEN_EDEFAULT;
		nachweisVorhandenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN, oldNachweisVorhanden, NACHWEIS_VORHANDEN_EDEFAULT, oldNachweisVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNachweisVorhanden() {
		return nachweisVorhandenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweis() {
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweis(NachweisdokumentType newNachweis, NotificationChain msgs) {
		NachweisdokumentType oldNachweis = nachweis;
		nachweis = newNachweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS, oldNachweis, newNachweis);
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
	public void setNachweis(NachweisdokumentType newNachweis) {
		if (newNachweis != nachweis) {
			NotificationChain msgs = null;
			if (nachweis != null)
				msgs = ((InternalEObject)nachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS, null, msgs);
			if (newNachweis != null)
				msgs = ((InternalEObject)newNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS, null, msgs);
			msgs = basicSetNachweis(newNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS, newNachweis, newNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS:
				return basicSetNachweis(null, msgs);
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
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN:
				return isNachweisVorhanden();
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS:
				return getNachweis();
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
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN:
				setNachweisVorhanden((Boolean)newValue);
				return;
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)newValue);
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
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN:
				unsetNachweisVorhanden();
				return;
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)null);
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
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS_VORHANDEN:
				return isSetNachweisVorhanden();
			case KinderwunschPackage.NACHWEIS_TYPE__NACHWEIS:
				return nachweis != null;
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
		result.append(" (nachweisVorhanden: ");
		if (nachweisVorhandenESet) result.append(nachweisVorhanden); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NachweisTypeImpl

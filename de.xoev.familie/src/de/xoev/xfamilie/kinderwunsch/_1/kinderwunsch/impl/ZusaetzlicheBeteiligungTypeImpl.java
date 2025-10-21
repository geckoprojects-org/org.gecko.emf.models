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
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zusaetzliche Beteiligung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl#isVorliegenNachweis <em>Vorliegen Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZusaetzlicheBeteiligungTypeImpl extends MinimalEObjectImpl.Container implements ZusaetzlicheBeteiligungType {
	/**
	 * The default value of the '{@link #isZusaetzlicheBeteiligung() <em>Zusaetzliche Beteiligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusaetzlicheBeteiligung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSAETZLICHE_BETEILIGUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZusaetzlicheBeteiligung() <em>Zusaetzliche Beteiligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZusaetzlicheBeteiligung()
	 * @generated
	 * @ordered
	 */
	protected boolean zusaetzlicheBeteiligung = ZUSAETZLICHE_BETEILIGUNG_EDEFAULT;

	/**
	 * This is true if the Zusaetzliche Beteiligung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zusaetzlicheBeteiligungESet;

	/**
	 * The default value of the '{@link #isVorliegenNachweis() <em>Vorliegen Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVorliegenNachweis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VORLIEGEN_NACHWEIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVorliegenNachweis() <em>Vorliegen Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVorliegenNachweis()
	 * @generated
	 * @ordered
	 */
	protected boolean vorliegenNachweis = VORLIEGEN_NACHWEIS_EDEFAULT;

	/**
	 * This is true if the Vorliegen Nachweis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vorliegenNachweisESet;

	/**
	 * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BETRAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal betrag = BETRAG_EDEFAULT;

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
	protected ZusaetzlicheBeteiligungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.ZUSAETZLICHE_BETEILIGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZusaetzlicheBeteiligung() {
		return zusaetzlicheBeteiligung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusaetzlicheBeteiligung(boolean newZusaetzlicheBeteiligung) {
		boolean oldZusaetzlicheBeteiligung = zusaetzlicheBeteiligung;
		zusaetzlicheBeteiligung = newZusaetzlicheBeteiligung;
		boolean oldZusaetzlicheBeteiligungESet = zusaetzlicheBeteiligungESet;
		zusaetzlicheBeteiligungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG, oldZusaetzlicheBeteiligung, zusaetzlicheBeteiligung, !oldZusaetzlicheBeteiligungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZusaetzlicheBeteiligung() {
		boolean oldZusaetzlicheBeteiligung = zusaetzlicheBeteiligung;
		boolean oldZusaetzlicheBeteiligungESet = zusaetzlicheBeteiligungESet;
		zusaetzlicheBeteiligung = ZUSAETZLICHE_BETEILIGUNG_EDEFAULT;
		zusaetzlicheBeteiligungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG, oldZusaetzlicheBeteiligung, ZUSAETZLICHE_BETEILIGUNG_EDEFAULT, oldZusaetzlicheBeteiligungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZusaetzlicheBeteiligung() {
		return zusaetzlicheBeteiligungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVorliegenNachweis() {
		return vorliegenNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVorliegenNachweis(boolean newVorliegenNachweis) {
		boolean oldVorliegenNachweis = vorliegenNachweis;
		vorliegenNachweis = newVorliegenNachweis;
		boolean oldVorliegenNachweisESet = vorliegenNachweisESet;
		vorliegenNachweisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS, oldVorliegenNachweis, vorliegenNachweis, !oldVorliegenNachweisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVorliegenNachweis() {
		boolean oldVorliegenNachweis = vorliegenNachweis;
		boolean oldVorliegenNachweisESet = vorliegenNachweisESet;
		vorliegenNachweis = VORLIEGEN_NACHWEIS_EDEFAULT;
		vorliegenNachweisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS, oldVorliegenNachweis, VORLIEGEN_NACHWEIS_EDEFAULT, oldVorliegenNachweisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVorliegenNachweis() {
		return vorliegenNachweisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBetrag() {
		return betrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetrag(BigDecimal newBetrag) {
		BigDecimal oldBetrag = betrag;
		betrag = newBetrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG, oldBetrag, betrag));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS, oldNachweis, newNachweis);
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
				msgs = ((InternalEObject)nachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS, null, msgs);
			if (newNachweis != null)
				msgs = ((InternalEObject)newNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS, null, msgs);
			msgs = basicSetNachweis(newNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS, newNachweis, newNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS:
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
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG:
				return isZusaetzlicheBeteiligung();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS:
				return isVorliegenNachweis();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG:
				return getBetrag();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS:
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
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG:
				setZusaetzlicheBeteiligung((Boolean)newValue);
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS:
				setVorliegenNachweis((Boolean)newValue);
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG:
				setBetrag((BigDecimal)newValue);
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS:
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
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG:
				unsetZusaetzlicheBeteiligung();
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS:
				unsetVorliegenNachweis();
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG:
				setBetrag(BETRAG_EDEFAULT);
				return;
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS:
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
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG:
				return isSetZusaetzlicheBeteiligung();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS:
				return isSetVorliegenNachweis();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG:
				return BETRAG_EDEFAULT == null ? betrag != null : !BETRAG_EDEFAULT.equals(betrag);
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS:
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
		result.append(" (zusaetzlicheBeteiligung: ");
		if (zusaetzlicheBeteiligungESet) result.append(zusaetzlicheBeteiligung); else result.append("<unset>");
		result.append(", vorliegenNachweis: ");
		if (vorliegenNachweisESet) result.append(vorliegenNachweis); else result.append("<unset>");
		result.append(", betrag: ");
		result.append(betrag);
		result.append(')');
		return result.toString();
	}

} //ZusaetzlicheBeteiligungTypeImpl

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
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType;

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
 * An implementation of the model object '<em><b>Zuschuesse Krankenversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getBeteiligteKrankenkassen <em>Beteiligte Krankenkassen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getZusaetzlicheBeteiligungGKV <em>Zusaetzliche Beteiligung GKV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getZusaetzlicheBeteiligungPKV <em>Zusaetzliche Beteiligung PKV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getBeteiligungBeihilfe <em>Beteiligung Beihilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl#getNachweiseRechnungen <em>Nachweise Rechnungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZuschuesseKrankenversicherungTypeImpl extends MinimalEObjectImpl.Container implements ZuschuesseKrankenversicherungType {
	/**
	 * The default value of the '{@link #getBeteiligteKrankenkassen() <em>Beteiligte Krankenkassen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeteiligteKrankenkassen()
	 * @generated
	 * @ordered
	 */
	protected static final String BETEILIGTE_KRANKENKASSEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeteiligteKrankenkassen() <em>Beteiligte Krankenkassen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeteiligteKrankenkassen()
	 * @generated
	 * @ordered
	 */
	protected String beteiligteKrankenkassen = BETEILIGTE_KRANKENKASSEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNegativbescheinigungVersicherungKostentraeger() <em>Negativbescheinigung Versicherung Kostentraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativbescheinigungVersicherungKostentraeger()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType negativbescheinigungVersicherungKostentraeger;

	/**
	 * The cached value of the '{@link #getZusaetzlicheBeteiligungGKV() <em>Zusaetzliche Beteiligung GKV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusaetzlicheBeteiligungGKV()
	 * @generated
	 * @ordered
	 */
	protected ZusaetzlicheBeteiligungType zusaetzlicheBeteiligungGKV;

	/**
	 * The cached value of the '{@link #getZusaetzlicheBeteiligungPKV() <em>Zusaetzliche Beteiligung PKV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusaetzlicheBeteiligungPKV()
	 * @generated
	 * @ordered
	 */
	protected ZusaetzlicheBeteiligungType zusaetzlicheBeteiligungPKV;

	/**
	 * The cached value of the '{@link #getBeteiligungBeihilfe() <em>Beteiligung Beihilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeteiligungBeihilfe()
	 * @generated
	 * @ordered
	 */
	protected ZusaetzlicheBeteiligungType beteiligungBeihilfe;

	/**
	 * The cached value of the '{@link #getNachweiseRechnungen() <em>Nachweise Rechnungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweiseRechnungen()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweiseRechnungenType> nachweiseRechnungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZuschuesseKrankenversicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeteiligteKrankenkassen() {
		return beteiligteKrankenkassen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeteiligteKrankenkassen(String newBeteiligteKrankenkassen) {
		String oldBeteiligteKrankenkassen = beteiligteKrankenkassen;
		beteiligteKrankenkassen = newBeteiligteKrankenkassen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN, oldBeteiligteKrankenkassen, beteiligteKrankenkassen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNegativbescheinigungVersicherungKostentraeger() {
		return negativbescheinigungVersicherungKostentraeger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType newNegativbescheinigungVersicherungKostentraeger, NotificationChain msgs) {
		NachweisdokumentType oldNegativbescheinigungVersicherungKostentraeger = negativbescheinigungVersicherungKostentraeger;
		negativbescheinigungVersicherungKostentraeger = newNegativbescheinigungVersicherungKostentraeger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, oldNegativbescheinigungVersicherungKostentraeger, newNegativbescheinigungVersicherungKostentraeger);
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
	public void setNegativbescheinigungVersicherungKostentraeger(NachweisdokumentType newNegativbescheinigungVersicherungKostentraeger) {
		if (newNegativbescheinigungVersicherungKostentraeger != negativbescheinigungVersicherungKostentraeger) {
			NotificationChain msgs = null;
			if (negativbescheinigungVersicherungKostentraeger != null)
				msgs = ((InternalEObject)negativbescheinigungVersicherungKostentraeger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, null, msgs);
			if (newNegativbescheinigungVersicherungKostentraeger != null)
				msgs = ((InternalEObject)newNegativbescheinigungVersicherungKostentraeger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, null, msgs);
			msgs = basicSetNegativbescheinigungVersicherungKostentraeger(newNegativbescheinigungVersicherungKostentraeger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER, newNegativbescheinigungVersicherungKostentraeger, newNegativbescheinigungVersicherungKostentraeger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusaetzlicheBeteiligungType getZusaetzlicheBeteiligungGKV() {
		return zusaetzlicheBeteiligungGKV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusaetzlicheBeteiligungGKV(ZusaetzlicheBeteiligungType newZusaetzlicheBeteiligungGKV, NotificationChain msgs) {
		ZusaetzlicheBeteiligungType oldZusaetzlicheBeteiligungGKV = zusaetzlicheBeteiligungGKV;
		zusaetzlicheBeteiligungGKV = newZusaetzlicheBeteiligungGKV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV, oldZusaetzlicheBeteiligungGKV, newZusaetzlicheBeteiligungGKV);
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
	public void setZusaetzlicheBeteiligungGKV(ZusaetzlicheBeteiligungType newZusaetzlicheBeteiligungGKV) {
		if (newZusaetzlicheBeteiligungGKV != zusaetzlicheBeteiligungGKV) {
			NotificationChain msgs = null;
			if (zusaetzlicheBeteiligungGKV != null)
				msgs = ((InternalEObject)zusaetzlicheBeteiligungGKV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV, null, msgs);
			if (newZusaetzlicheBeteiligungGKV != null)
				msgs = ((InternalEObject)newZusaetzlicheBeteiligungGKV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV, null, msgs);
			msgs = basicSetZusaetzlicheBeteiligungGKV(newZusaetzlicheBeteiligungGKV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV, newZusaetzlicheBeteiligungGKV, newZusaetzlicheBeteiligungGKV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusaetzlicheBeteiligungType getZusaetzlicheBeteiligungPKV() {
		return zusaetzlicheBeteiligungPKV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusaetzlicheBeteiligungPKV(ZusaetzlicheBeteiligungType newZusaetzlicheBeteiligungPKV, NotificationChain msgs) {
		ZusaetzlicheBeteiligungType oldZusaetzlicheBeteiligungPKV = zusaetzlicheBeteiligungPKV;
		zusaetzlicheBeteiligungPKV = newZusaetzlicheBeteiligungPKV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV, oldZusaetzlicheBeteiligungPKV, newZusaetzlicheBeteiligungPKV);
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
	public void setZusaetzlicheBeteiligungPKV(ZusaetzlicheBeteiligungType newZusaetzlicheBeteiligungPKV) {
		if (newZusaetzlicheBeteiligungPKV != zusaetzlicheBeteiligungPKV) {
			NotificationChain msgs = null;
			if (zusaetzlicheBeteiligungPKV != null)
				msgs = ((InternalEObject)zusaetzlicheBeteiligungPKV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV, null, msgs);
			if (newZusaetzlicheBeteiligungPKV != null)
				msgs = ((InternalEObject)newZusaetzlicheBeteiligungPKV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV, null, msgs);
			msgs = basicSetZusaetzlicheBeteiligungPKV(newZusaetzlicheBeteiligungPKV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV, newZusaetzlicheBeteiligungPKV, newZusaetzlicheBeteiligungPKV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusaetzlicheBeteiligungType getBeteiligungBeihilfe() {
		return beteiligungBeihilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeteiligungBeihilfe(ZusaetzlicheBeteiligungType newBeteiligungBeihilfe, NotificationChain msgs) {
		ZusaetzlicheBeteiligungType oldBeteiligungBeihilfe = beteiligungBeihilfe;
		beteiligungBeihilfe = newBeteiligungBeihilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE, oldBeteiligungBeihilfe, newBeteiligungBeihilfe);
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
	public void setBeteiligungBeihilfe(ZusaetzlicheBeteiligungType newBeteiligungBeihilfe) {
		if (newBeteiligungBeihilfe != beteiligungBeihilfe) {
			NotificationChain msgs = null;
			if (beteiligungBeihilfe != null)
				msgs = ((InternalEObject)beteiligungBeihilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE, null, msgs);
			if (newBeteiligungBeihilfe != null)
				msgs = ((InternalEObject)newBeteiligungBeihilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE, null, msgs);
			msgs = basicSetBeteiligungBeihilfe(newBeteiligungBeihilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE, newBeteiligungBeihilfe, newBeteiligungBeihilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweiseRechnungenType> getNachweiseRechnungen() {
		if (nachweiseRechnungen == null) {
			nachweiseRechnungen = new EObjectContainmentEList<NachweiseRechnungenType>(NachweiseRechnungenType.class, this, KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN);
		}
		return nachweiseRechnungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return basicSetNegativbescheinigungVersicherungKostentraeger(null, msgs);
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV:
				return basicSetZusaetzlicheBeteiligungGKV(null, msgs);
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV:
				return basicSetZusaetzlicheBeteiligungPKV(null, msgs);
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE:
				return basicSetBeteiligungBeihilfe(null, msgs);
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN:
				return ((InternalEList<?>)getNachweiseRechnungen()).basicRemove(otherEnd, msgs);
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
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN:
				return getBeteiligteKrankenkassen();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return getNegativbescheinigungVersicherungKostentraeger();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV:
				return getZusaetzlicheBeteiligungGKV();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV:
				return getZusaetzlicheBeteiligungPKV();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE:
				return getBeteiligungBeihilfe();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN:
				return getNachweiseRechnungen();
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
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN:
				setBeteiligteKrankenkassen((String)newValue);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				setNegativbescheinigungVersicherungKostentraeger((NachweisdokumentType)newValue);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV:
				setZusaetzlicheBeteiligungGKV((ZusaetzlicheBeteiligungType)newValue);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV:
				setZusaetzlicheBeteiligungPKV((ZusaetzlicheBeteiligungType)newValue);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE:
				setBeteiligungBeihilfe((ZusaetzlicheBeteiligungType)newValue);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN:
				getNachweiseRechnungen().clear();
				getNachweiseRechnungen().addAll((Collection<? extends NachweiseRechnungenType>)newValue);
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
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN:
				setBeteiligteKrankenkassen(BETEILIGTE_KRANKENKASSEN_EDEFAULT);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				setNegativbescheinigungVersicherungKostentraeger((NachweisdokumentType)null);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV:
				setZusaetzlicheBeteiligungGKV((ZusaetzlicheBeteiligungType)null);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV:
				setZusaetzlicheBeteiligungPKV((ZusaetzlicheBeteiligungType)null);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE:
				setBeteiligungBeihilfe((ZusaetzlicheBeteiligungType)null);
				return;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN:
				getNachweiseRechnungen().clear();
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
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN:
				return BETEILIGTE_KRANKENKASSEN_EDEFAULT == null ? beteiligteKrankenkassen != null : !BETEILIGTE_KRANKENKASSEN_EDEFAULT.equals(beteiligteKrankenkassen);
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER:
				return negativbescheinigungVersicherungKostentraeger != null;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV:
				return zusaetzlicheBeteiligungGKV != null;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV:
				return zusaetzlicheBeteiligungPKV != null;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE:
				return beteiligungBeihilfe != null;
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN:
				return nachweiseRechnungen != null && !nachweiseRechnungen.isEmpty();
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
		result.append(" (beteiligteKrankenkassen: ");
		result.append(beteiligteKrankenkassen);
		result.append(')');
		return result.toString();
	}

} //ZuschuesseKrankenversicherungTypeImpl

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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vorherige Behandlungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#getBefruchtungsbehandlungen <em>Befruchtungsbehandlungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#isWiederholungsversuch <em>Wiederholungsversuch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#getNameReproduktionseinrichtung <em>Name Reproduktionseinrichtung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#getPostleitzahlReproduktionseinrichtung <em>Postleitzahl Reproduktionseinrichtung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#isBeratung <em>Beratung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VorherigeBehandlungenTypeImpl extends MinimalEObjectImpl.Container implements VorherigeBehandlungenType {
	/**
	 * The default value of the '{@link #isBisherGefoerderteBehandlungen() <em>Bisher Gefoerderte Behandlungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBisherGefoerderteBehandlungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BISHER_GEFOERDERTE_BEHANDLUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBisherGefoerderteBehandlungen() <em>Bisher Gefoerderte Behandlungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBisherGefoerderteBehandlungen()
	 * @generated
	 * @ordered
	 */
	protected boolean bisherGefoerderteBehandlungen = BISHER_GEFOERDERTE_BEHANDLUNGEN_EDEFAULT;

	/**
	 * This is true if the Bisher Gefoerderte Behandlungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bisherGefoerderteBehandlungenESet;

	/**
	 * The cached value of the '{@link #getBefruchtungsbehandlungen() <em>Befruchtungsbehandlungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefruchtungsbehandlungen()
	 * @generated
	 * @ordered
	 */
	protected BefruchtungsbehandlungenType befruchtungsbehandlungen;

	/**
	 * The default value of the '{@link #isWiederholungsversuch() <em>Wiederholungsversuch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWiederholungsversuch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WIEDERHOLUNGSVERSUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWiederholungsversuch() <em>Wiederholungsversuch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWiederholungsversuch()
	 * @generated
	 * @ordered
	 */
	protected boolean wiederholungsversuch = WIEDERHOLUNGSVERSUCH_EDEFAULT;

	/**
	 * This is true if the Wiederholungsversuch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wiederholungsversuchESet;

	/**
	 * The default value of the '{@link #getNameReproduktionseinrichtung() <em>Name Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameReproduktionseinrichtung()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_REPRODUKTIONSEINRICHTUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameReproduktionseinrichtung() <em>Name Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameReproduktionseinrichtung()
	 * @generated
	 * @ordered
	 */
	protected String nameReproduktionseinrichtung = NAME_REPRODUKTIONSEINRICHTUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahlReproduktionseinrichtung() <em>Postleitzahl Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahlReproduktionseinrichtung()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahlReproduktionseinrichtung() <em>Postleitzahl Reproduktionseinrichtung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahlReproduktionseinrichtung()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahlReproduktionseinrichtung = POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isBeratung() <em>Beratung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeratung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERATUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeratung() <em>Beratung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeratung()
	 * @generated
	 * @ordered
	 */
	protected boolean beratung = BERATUNG_EDEFAULT;

	/**
	 * This is true if the Beratung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beratungESet;

	/**
	 * The cached value of the '{@link #getNachweisVierterVersuch() <em>Nachweis Vierter Versuch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisVierterVersuch()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweisVierterVersuch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VorherigeBehandlungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.VORHERIGE_BEHANDLUNGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBisherGefoerderteBehandlungen() {
		return bisherGefoerderteBehandlungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBisherGefoerderteBehandlungen(boolean newBisherGefoerderteBehandlungen) {
		boolean oldBisherGefoerderteBehandlungen = bisherGefoerderteBehandlungen;
		bisherGefoerderteBehandlungen = newBisherGefoerderteBehandlungen;
		boolean oldBisherGefoerderteBehandlungenESet = bisherGefoerderteBehandlungenESet;
		bisherGefoerderteBehandlungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN, oldBisherGefoerderteBehandlungen, bisherGefoerderteBehandlungen, !oldBisherGefoerderteBehandlungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBisherGefoerderteBehandlungen() {
		boolean oldBisherGefoerderteBehandlungen = bisherGefoerderteBehandlungen;
		boolean oldBisherGefoerderteBehandlungenESet = bisherGefoerderteBehandlungenESet;
		bisherGefoerderteBehandlungen = BISHER_GEFOERDERTE_BEHANDLUNGEN_EDEFAULT;
		bisherGefoerderteBehandlungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN, oldBisherGefoerderteBehandlungen, BISHER_GEFOERDERTE_BEHANDLUNGEN_EDEFAULT, oldBisherGefoerderteBehandlungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBisherGefoerderteBehandlungen() {
		return bisherGefoerderteBehandlungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BefruchtungsbehandlungenType getBefruchtungsbehandlungen() {
		return befruchtungsbehandlungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBefruchtungsbehandlungen(BefruchtungsbehandlungenType newBefruchtungsbehandlungen, NotificationChain msgs) {
		BefruchtungsbehandlungenType oldBefruchtungsbehandlungen = befruchtungsbehandlungen;
		befruchtungsbehandlungen = newBefruchtungsbehandlungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN, oldBefruchtungsbehandlungen, newBefruchtungsbehandlungen);
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
	public void setBefruchtungsbehandlungen(BefruchtungsbehandlungenType newBefruchtungsbehandlungen) {
		if (newBefruchtungsbehandlungen != befruchtungsbehandlungen) {
			NotificationChain msgs = null;
			if (befruchtungsbehandlungen != null)
				msgs = ((InternalEObject)befruchtungsbehandlungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN, null, msgs);
			if (newBefruchtungsbehandlungen != null)
				msgs = ((InternalEObject)newBefruchtungsbehandlungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN, null, msgs);
			msgs = basicSetBefruchtungsbehandlungen(newBefruchtungsbehandlungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN, newBefruchtungsbehandlungen, newBefruchtungsbehandlungen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWiederholungsversuch() {
		return wiederholungsversuch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWiederholungsversuch(boolean newWiederholungsversuch) {
		boolean oldWiederholungsversuch = wiederholungsversuch;
		wiederholungsversuch = newWiederholungsversuch;
		boolean oldWiederholungsversuchESet = wiederholungsversuchESet;
		wiederholungsversuchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH, oldWiederholungsversuch, wiederholungsversuch, !oldWiederholungsversuchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWiederholungsversuch() {
		boolean oldWiederholungsversuch = wiederholungsversuch;
		boolean oldWiederholungsversuchESet = wiederholungsversuchESet;
		wiederholungsversuch = WIEDERHOLUNGSVERSUCH_EDEFAULT;
		wiederholungsversuchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH, oldWiederholungsversuch, WIEDERHOLUNGSVERSUCH_EDEFAULT, oldWiederholungsversuchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWiederholungsversuch() {
		return wiederholungsversuchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameReproduktionseinrichtung() {
		return nameReproduktionseinrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameReproduktionseinrichtung(String newNameReproduktionseinrichtung) {
		String oldNameReproduktionseinrichtung = nameReproduktionseinrichtung;
		nameReproduktionseinrichtung = newNameReproduktionseinrichtung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG, oldNameReproduktionseinrichtung, nameReproduktionseinrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostleitzahlReproduktionseinrichtung() {
		return postleitzahlReproduktionseinrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostleitzahlReproduktionseinrichtung(String newPostleitzahlReproduktionseinrichtung) {
		String oldPostleitzahlReproduktionseinrichtung = postleitzahlReproduktionseinrichtung;
		postleitzahlReproduktionseinrichtung = newPostleitzahlReproduktionseinrichtung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG, oldPostleitzahlReproduktionseinrichtung, postleitzahlReproduktionseinrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeratung() {
		return beratung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeratung(boolean newBeratung) {
		boolean oldBeratung = beratung;
		beratung = newBeratung;
		boolean oldBeratungESet = beratungESet;
		beratungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG, oldBeratung, beratung, !oldBeratungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeratung() {
		boolean oldBeratung = beratung;
		boolean oldBeratungESet = beratungESet;
		beratung = BERATUNG_EDEFAULT;
		beratungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG, oldBeratung, BERATUNG_EDEFAULT, oldBeratungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeratung() {
		return beratungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweisVierterVersuch() {
		return nachweisVierterVersuch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweisVierterVersuch(NachweisdokumentType newNachweisVierterVersuch, NotificationChain msgs) {
		NachweisdokumentType oldNachweisVierterVersuch = nachweisVierterVersuch;
		nachweisVierterVersuch = newNachweisVierterVersuch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH, oldNachweisVierterVersuch, newNachweisVierterVersuch);
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
	public void setNachweisVierterVersuch(NachweisdokumentType newNachweisVierterVersuch) {
		if (newNachweisVierterVersuch != nachweisVierterVersuch) {
			NotificationChain msgs = null;
			if (nachweisVierterVersuch != null)
				msgs = ((InternalEObject)nachweisVierterVersuch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH, null, msgs);
			if (newNachweisVierterVersuch != null)
				msgs = ((InternalEObject)newNachweisVierterVersuch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH, null, msgs);
			msgs = basicSetNachweisVierterVersuch(newNachweisVierterVersuch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH, newNachweisVierterVersuch, newNachweisVierterVersuch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN:
				return basicSetBefruchtungsbehandlungen(null, msgs);
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return basicSetNachweisVierterVersuch(null, msgs);
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
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN:
				return isBisherGefoerderteBehandlungen();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN:
				return getBefruchtungsbehandlungen();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH:
				return isWiederholungsversuch();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG:
				return getNameReproduktionseinrichtung();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG:
				return getPostleitzahlReproduktionseinrichtung();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG:
				return isBeratung();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return getNachweisVierterVersuch();
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
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN:
				setBisherGefoerderteBehandlungen((Boolean)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN:
				setBefruchtungsbehandlungen((BefruchtungsbehandlungenType)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH:
				setWiederholungsversuch((Boolean)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG:
				setNameReproduktionseinrichtung((String)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG:
				setPostleitzahlReproduktionseinrichtung((String)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG:
				setBeratung((Boolean)newValue);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH:
				setNachweisVierterVersuch((NachweisdokumentType)newValue);
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
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN:
				unsetBisherGefoerderteBehandlungen();
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN:
				setBefruchtungsbehandlungen((BefruchtungsbehandlungenType)null);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH:
				unsetWiederholungsversuch();
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG:
				setNameReproduktionseinrichtung(NAME_REPRODUKTIONSEINRICHTUNG_EDEFAULT);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG:
				setPostleitzahlReproduktionseinrichtung(POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG_EDEFAULT);
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG:
				unsetBeratung();
				return;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH:
				setNachweisVierterVersuch((NachweisdokumentType)null);
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
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN:
				return isSetBisherGefoerderteBehandlungen();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN:
				return befruchtungsbehandlungen != null;
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH:
				return isSetWiederholungsversuch();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG:
				return NAME_REPRODUKTIONSEINRICHTUNG_EDEFAULT == null ? nameReproduktionseinrichtung != null : !NAME_REPRODUKTIONSEINRICHTUNG_EDEFAULT.equals(nameReproduktionseinrichtung);
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG:
				return POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG_EDEFAULT == null ? postleitzahlReproduktionseinrichtung != null : !POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG_EDEFAULT.equals(postleitzahlReproduktionseinrichtung);
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG:
				return isSetBeratung();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH:
				return nachweisVierterVersuch != null;
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
		result.append(" (bisherGefoerderteBehandlungen: ");
		if (bisherGefoerderteBehandlungenESet) result.append(bisherGefoerderteBehandlungen); else result.append("<unset>");
		result.append(", wiederholungsversuch: ");
		if (wiederholungsversuchESet) result.append(wiederholungsversuch); else result.append("<unset>");
		result.append(", nameReproduktionseinrichtung: ");
		result.append(nameReproduktionseinrichtung);
		result.append(", postleitzahlReproduktionseinrichtung: ");
		result.append(postleitzahlReproduktionseinrichtung);
		result.append(", beratung: ");
		if (beratungESet) result.append(beratung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //VorherigeBehandlungenTypeImpl

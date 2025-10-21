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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilHJVType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHJVType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hilfen Zur Erziehung Anfrage HJV0702 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getAuswahlAnfrageHJV <em>Auswahl Anfrage HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getAnliegensklaerungHJV <em>Anliegensklaerung HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getPersoenlicheAngabenHJV <em>Persoenliche Angaben HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getBegruendungHJV <em>Begruendung HJV</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getAngabenAndererElternteil <em>Angaben Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAnfrageHJV0702TypeImpl#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HilfenZurErziehungAnfrageHJV0702TypeImpl extends AntragsnachrichtTypeImpl implements HilfenZurErziehungAnfrageHJV0702Type {
	/**
	 * The cached value of the '{@link #getAuswahlAnfrageHJV() <em>Auswahl Anfrage HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuswahlAnfrageHJV()
	 * @generated
	 * @ordered
	 */
	protected CodeAuswahlDerHilfeHzEType auswahlAnfrageHJV;

	/**
	 * The cached value of the '{@link #getAnliegensklaerungHJV() <em>Anliegensklaerung HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegensklaerungHJV()
	 * @generated
	 * @ordered
	 */
	protected AnliegensklaerungAnfrageType anliegensklaerungHJV;

	/**
	 * The cached value of the '{@link #getPersoenlicheAngabenHJV() <em>Persoenliche Angaben HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersoenlicheAngabenHJV()
	 * @generated
	 * @ordered
	 */
	protected PersoenlicheAngabenHJVType persoenlicheAngabenHJV;

	/**
	 * The cached value of the '{@link #getBegruendungHJV() <em>Begruendung HJV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegruendungHJV()
	 * @generated
	 * @ordered
	 */
	protected BegruendungDesHilfebedarfsType begruendungHJV;

	/**
	 * The cached value of the '{@link #getAngabenAndererElternteil() <em>Angaben Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenAndererElternteil()
	 * @generated
	 * @ordered
	 */
	protected AngabenElternteilHJVType angabenAndererElternteil;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * The default value of the '{@link #isRichtigkeitAngaben() <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RICHTIGKEIT_ANGABEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRichtigkeitAngaben() <em>Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitAngaben = RICHTIGKEIT_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Richtigkeit Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitAngabenESet;

	/**
	 * The default value of the '{@link #isEinwilligungZwischenspeichern() <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZwischenspeichern()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinwilligungZwischenspeichern() <em>Einwilligung Zwischenspeichern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungZwischenspeichern()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZwischenspeichern = EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT;

	/**
	 * This is true if the Einwilligung Zwischenspeichern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungZwischenspeichernESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HilfenZurErziehungAnfrageHJV0702TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAuswahlDerHilfeHzEType getAuswahlAnfrageHJV() {
		return auswahlAnfrageHJV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuswahlAnfrageHJV(CodeAuswahlDerHilfeHzEType newAuswahlAnfrageHJV, NotificationChain msgs) {
		CodeAuswahlDerHilfeHzEType oldAuswahlAnfrageHJV = auswahlAnfrageHJV;
		auswahlAnfrageHJV = newAuswahlAnfrageHJV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV, oldAuswahlAnfrageHJV, newAuswahlAnfrageHJV);
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
	public void setAuswahlAnfrageHJV(CodeAuswahlDerHilfeHzEType newAuswahlAnfrageHJV) {
		if (newAuswahlAnfrageHJV != auswahlAnfrageHJV) {
			NotificationChain msgs = null;
			if (auswahlAnfrageHJV != null)
				msgs = ((InternalEObject)auswahlAnfrageHJV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV, null, msgs);
			if (newAuswahlAnfrageHJV != null)
				msgs = ((InternalEObject)newAuswahlAnfrageHJV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV, null, msgs);
			msgs = basicSetAuswahlAnfrageHJV(newAuswahlAnfrageHJV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV, newAuswahlAnfrageHJV, newAuswahlAnfrageHJV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungAnfrageType getAnliegensklaerungHJV() {
		return anliegensklaerungHJV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegensklaerungHJV(AnliegensklaerungAnfrageType newAnliegensklaerungHJV, NotificationChain msgs) {
		AnliegensklaerungAnfrageType oldAnliegensklaerungHJV = anliegensklaerungHJV;
		anliegensklaerungHJV = newAnliegensklaerungHJV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV, oldAnliegensklaerungHJV, newAnliegensklaerungHJV);
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
	public void setAnliegensklaerungHJV(AnliegensklaerungAnfrageType newAnliegensklaerungHJV) {
		if (newAnliegensklaerungHJV != anliegensklaerungHJV) {
			NotificationChain msgs = null;
			if (anliegensklaerungHJV != null)
				msgs = ((InternalEObject)anliegensklaerungHJV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV, null, msgs);
			if (newAnliegensklaerungHJV != null)
				msgs = ((InternalEObject)newAnliegensklaerungHJV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV, null, msgs);
			msgs = basicSetAnliegensklaerungHJV(newAnliegensklaerungHJV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV, newAnliegensklaerungHJV, newAnliegensklaerungHJV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenHJVType getPersoenlicheAngabenHJV() {
		return persoenlicheAngabenHJV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersoenlicheAngabenHJV(PersoenlicheAngabenHJVType newPersoenlicheAngabenHJV, NotificationChain msgs) {
		PersoenlicheAngabenHJVType oldPersoenlicheAngabenHJV = persoenlicheAngabenHJV;
		persoenlicheAngabenHJV = newPersoenlicheAngabenHJV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV, oldPersoenlicheAngabenHJV, newPersoenlicheAngabenHJV);
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
	public void setPersoenlicheAngabenHJV(PersoenlicheAngabenHJVType newPersoenlicheAngabenHJV) {
		if (newPersoenlicheAngabenHJV != persoenlicheAngabenHJV) {
			NotificationChain msgs = null;
			if (persoenlicheAngabenHJV != null)
				msgs = ((InternalEObject)persoenlicheAngabenHJV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV, null, msgs);
			if (newPersoenlicheAngabenHJV != null)
				msgs = ((InternalEObject)newPersoenlicheAngabenHJV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV, null, msgs);
			msgs = basicSetPersoenlicheAngabenHJV(newPersoenlicheAngabenHJV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV, newPersoenlicheAngabenHJV, newPersoenlicheAngabenHJV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BegruendungDesHilfebedarfsType getBegruendungHJV() {
		return begruendungHJV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegruendungHJV(BegruendungDesHilfebedarfsType newBegruendungHJV, NotificationChain msgs) {
		BegruendungDesHilfebedarfsType oldBegruendungHJV = begruendungHJV;
		begruendungHJV = newBegruendungHJV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV, oldBegruendungHJV, newBegruendungHJV);
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
	public void setBegruendungHJV(BegruendungDesHilfebedarfsType newBegruendungHJV) {
		if (newBegruendungHJV != begruendungHJV) {
			NotificationChain msgs = null;
			if (begruendungHJV != null)
				msgs = ((InternalEObject)begruendungHJV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV, null, msgs);
			if (newBegruendungHJV != null)
				msgs = ((InternalEObject)newBegruendungHJV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV, null, msgs);
			msgs = basicSetBegruendungHJV(newBegruendungHJV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV, newBegruendungHJV, newBegruendungHJV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenElternteilHJVType getAngabenAndererElternteil() {
		return angabenAndererElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenAndererElternteil(AngabenElternteilHJVType newAngabenAndererElternteil, NotificationChain msgs) {
		AngabenElternteilHJVType oldAngabenAndererElternteil = angabenAndererElternteil;
		angabenAndererElternteil = newAngabenAndererElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL, oldAngabenAndererElternteil, newAngabenAndererElternteil);
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
	public void setAngabenAndererElternteil(AngabenElternteilHJVType newAngabenAndererElternteil) {
		if (newAngabenAndererElternteil != angabenAndererElternteil) {
			NotificationChain msgs = null;
			if (angabenAndererElternteil != null)
				msgs = ((InternalEObject)angabenAndererElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL, null, msgs);
			if (newAngabenAndererElternteil != null)
				msgs = ((InternalEObject)newAngabenAndererElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL, null, msgs);
			msgs = basicSetAngabenAndererElternteil(newAngabenAndererElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL, newAngabenAndererElternteil, newAngabenAndererElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRichtigkeitAngaben() {
		return richtigkeitAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRichtigkeitAngaben(boolean newRichtigkeitAngaben) {
		boolean oldRichtigkeitAngaben = richtigkeitAngaben;
		richtigkeitAngaben = newRichtigkeitAngaben;
		boolean oldRichtigkeitAngabenESet = richtigkeitAngabenESet;
		richtigkeitAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, richtigkeitAngaben, !oldRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRichtigkeitAngaben() {
		boolean oldRichtigkeitAngaben = richtigkeitAngaben;
		boolean oldRichtigkeitAngabenESet = richtigkeitAngabenESet;
		richtigkeitAngaben = RICHTIGKEIT_ANGABEN_EDEFAULT;
		richtigkeitAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, RICHTIGKEIT_ANGABEN_EDEFAULT, oldRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRichtigkeitAngaben() {
		return richtigkeitAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligungZwischenspeichern() {
		return einwilligungZwischenspeichern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligungZwischenspeichern(boolean newEinwilligungZwischenspeichern) {
		boolean oldEinwilligungZwischenspeichern = einwilligungZwischenspeichern;
		einwilligungZwischenspeichern = newEinwilligungZwischenspeichern;
		boolean oldEinwilligungZwischenspeichernESet = einwilligungZwischenspeichernESet;
		einwilligungZwischenspeichernESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, einwilligungZwischenspeichern, !oldEinwilligungZwischenspeichernESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligungZwischenspeichern() {
		boolean oldEinwilligungZwischenspeichern = einwilligungZwischenspeichern;
		boolean oldEinwilligungZwischenspeichernESet = einwilligungZwischenspeichernESet;
		einwilligungZwischenspeichern = EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT;
		einwilligungZwischenspeichernESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT, oldEinwilligungZwischenspeichernESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligungZwischenspeichern() {
		return einwilligungZwischenspeichernESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV:
				return basicSetAuswahlAnfrageHJV(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV:
				return basicSetAnliegensklaerungHJV(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV:
				return basicSetPersoenlicheAngabenHJV(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV:
				return basicSetBegruendungHJV(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL:
				return basicSetAngabenAndererElternteil(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV:
				return getAuswahlAnfrageHJV();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV:
				return getAnliegensklaerungHJV();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV:
				return getPersoenlicheAngabenHJV();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV:
				return getBegruendungHJV();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL:
				return getAngabenAndererElternteil();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO:
				return getDsgvo();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN:
				return isRichtigkeitAngaben();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
				return isEinwilligungZwischenspeichern();
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV:
				setAuswahlAnfrageHJV((CodeAuswahlDerHilfeHzEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV:
				setAnliegensklaerungHJV((AnliegensklaerungAnfrageType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV:
				setPersoenlicheAngabenHJV((PersoenlicheAngabenHJVType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV:
				setBegruendungHJV((BegruendungDesHilfebedarfsType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL:
				setAngabenAndererElternteil((AngabenElternteilHJVType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN:
				setRichtigkeitAngaben((Boolean)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
				setEinwilligungZwischenspeichern((Boolean)newValue);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV:
				setAuswahlAnfrageHJV((CodeAuswahlDerHilfeHzEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV:
				setAnliegensklaerungHJV((AnliegensklaerungAnfrageType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV:
				setPersoenlicheAngabenHJV((PersoenlicheAngabenHJVType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV:
				setBegruendungHJV((BegruendungDesHilfebedarfsType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL:
				setAngabenAndererElternteil((AngabenElternteilHJVType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN:
				unsetRichtigkeitAngaben();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
				unsetEinwilligungZwischenspeichern();
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__AUSWAHL_ANFRAGE_HJV:
				return auswahlAnfrageHJV != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANLIEGENSKLAERUNG_HJV:
				return anliegensklaerungHJV != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__PERSOENLICHE_ANGABEN_HJV:
				return persoenlicheAngabenHJV != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__BEGRUENDUNG_HJV:
				return begruendungHJV != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__ANGABEN_ANDERER_ELTERNTEIL:
				return angabenAndererElternteil != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__DSGVO:
				return dsgvo != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__RICHTIGKEIT_ANGABEN:
				return isSetRichtigkeitAngaben();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
				return isSetEinwilligungZwischenspeichern();
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
		result.append(" (richtigkeitAngaben: ");
		if (richtigkeitAngabenESet) result.append(richtigkeitAngaben); else result.append("<unset>");
		result.append(", einwilligungZwischenspeichern: ");
		if (einwilligungZwischenspeichernESet) result.append(einwilligungZwischenspeichern); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HilfenZurErziehungAnfrageHJV0702TypeImpl

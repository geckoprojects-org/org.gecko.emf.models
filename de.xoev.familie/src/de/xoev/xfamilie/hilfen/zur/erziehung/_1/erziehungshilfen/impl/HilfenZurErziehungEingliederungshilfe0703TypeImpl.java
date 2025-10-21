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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenElternteilEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.BegruendungDesHilfebedarfsType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenEingliederungType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hilfen Zur Erziehung Eingliederungshilfe0703 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getAuswahlAnfrageEingliederung <em>Auswahl Anfrage Eingliederung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getAnliegensklaerungEingliederung <em>Anliegensklaerung Eingliederung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getAngabenKind <em>Angaben Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getBegruendungHZE <em>Begruendung HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getAngabenElternteile <em>Angaben Elternteile</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#isRichtigkeitAngaben <em>Richtigkeit Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungEingliederungshilfe0703TypeImpl#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HilfenZurErziehungEingliederungshilfe0703TypeImpl extends AntragsnachrichtTypeImpl implements HilfenZurErziehungEingliederungshilfe0703Type {
	/**
	 * The cached value of the '{@link #getAuswahlAnfrageEingliederung() <em>Auswahl Anfrage Eingliederung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuswahlAnfrageEingliederung()
	 * @generated
	 * @ordered
	 */
	protected CodeAuswahlDerHilfeHzEType auswahlAnfrageEingliederung;

	/**
	 * The cached value of the '{@link #getAnliegensklaerungEingliederung() <em>Anliegensklaerung Eingliederung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegensklaerungEingliederung()
	 * @generated
	 * @ordered
	 */
	protected AnliegensklaerungAnfrageType anliegensklaerungEingliederung;

	/**
	 * The cached value of the '{@link #getPersoenlicheAngabenZuIhrerPerson() <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 * @ordered
	 */
	protected PersoenlicheAngabenEingliederungType persoenlicheAngabenZuIhrerPerson;

	/**
	 * The cached value of the '{@link #getAngabenKind() <em>Angaben Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenKind()
	 * @generated
	 * @ordered
	 */
	protected AngabenKindEingliederungType angabenKind;

	/**
	 * The cached value of the '{@link #getBegruendungHZE() <em>Begruendung HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegruendungHZE()
	 * @generated
	 * @ordered
	 */
	protected BegruendungDesHilfebedarfsType begruendungHZE;

	/**
	 * The cached value of the '{@link #getAngabenElternteile() <em>Angaben Elternteile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenElternteile()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenElternteilEingliederungType> angabenElternteile;

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
	protected HilfenZurErziehungEingliederungshilfe0703TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAuswahlDerHilfeHzEType getAuswahlAnfrageEingliederung() {
		return auswahlAnfrageEingliederung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuswahlAnfrageEingliederung(CodeAuswahlDerHilfeHzEType newAuswahlAnfrageEingliederung, NotificationChain msgs) {
		CodeAuswahlDerHilfeHzEType oldAuswahlAnfrageEingliederung = auswahlAnfrageEingliederung;
		auswahlAnfrageEingliederung = newAuswahlAnfrageEingliederung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG, oldAuswahlAnfrageEingliederung, newAuswahlAnfrageEingliederung);
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
	public void setAuswahlAnfrageEingliederung(CodeAuswahlDerHilfeHzEType newAuswahlAnfrageEingliederung) {
		if (newAuswahlAnfrageEingliederung != auswahlAnfrageEingliederung) {
			NotificationChain msgs = null;
			if (auswahlAnfrageEingliederung != null)
				msgs = ((InternalEObject)auswahlAnfrageEingliederung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG, null, msgs);
			if (newAuswahlAnfrageEingliederung != null)
				msgs = ((InternalEObject)newAuswahlAnfrageEingliederung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG, null, msgs);
			msgs = basicSetAuswahlAnfrageEingliederung(newAuswahlAnfrageEingliederung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG, newAuswahlAnfrageEingliederung, newAuswahlAnfrageEingliederung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungAnfrageType getAnliegensklaerungEingliederung() {
		return anliegensklaerungEingliederung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegensklaerungEingliederung(AnliegensklaerungAnfrageType newAnliegensklaerungEingliederung, NotificationChain msgs) {
		AnliegensklaerungAnfrageType oldAnliegensklaerungEingliederung = anliegensklaerungEingliederung;
		anliegensklaerungEingliederung = newAnliegensklaerungEingliederung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG, oldAnliegensklaerungEingliederung, newAnliegensklaerungEingliederung);
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
	public void setAnliegensklaerungEingliederung(AnliegensklaerungAnfrageType newAnliegensklaerungEingliederung) {
		if (newAnliegensklaerungEingliederung != anliegensklaerungEingliederung) {
			NotificationChain msgs = null;
			if (anliegensklaerungEingliederung != null)
				msgs = ((InternalEObject)anliegensklaerungEingliederung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG, null, msgs);
			if (newAnliegensklaerungEingliederung != null)
				msgs = ((InternalEObject)newAnliegensklaerungEingliederung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG, null, msgs);
			msgs = basicSetAnliegensklaerungEingliederung(newAnliegensklaerungEingliederung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG, newAnliegensklaerungEingliederung, newAnliegensklaerungEingliederung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenEingliederungType getPersoenlicheAngabenZuIhrerPerson() {
		return persoenlicheAngabenZuIhrerPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenEingliederungType newPersoenlicheAngabenZuIhrerPerson, NotificationChain msgs) {
		PersoenlicheAngabenEingliederungType oldPersoenlicheAngabenZuIhrerPerson = persoenlicheAngabenZuIhrerPerson;
		persoenlicheAngabenZuIhrerPerson = newPersoenlicheAngabenZuIhrerPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, oldPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson);
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
	public void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenEingliederungType newPersoenlicheAngabenZuIhrerPerson) {
		if (newPersoenlicheAngabenZuIhrerPerson != persoenlicheAngabenZuIhrerPerson) {
			NotificationChain msgs = null;
			if (persoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)persoenlicheAngabenZuIhrerPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			if (newPersoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)newPersoenlicheAngabenZuIhrerPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			msgs = basicSetPersoenlicheAngabenZuIhrerPerson(newPersoenlicheAngabenZuIhrerPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, newPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindEingliederungType getAngabenKind() {
		return angabenKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenKind(AngabenKindEingliederungType newAngabenKind, NotificationChain msgs) {
		AngabenKindEingliederungType oldAngabenKind = angabenKind;
		angabenKind = newAngabenKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND, oldAngabenKind, newAngabenKind);
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
	public void setAngabenKind(AngabenKindEingliederungType newAngabenKind) {
		if (newAngabenKind != angabenKind) {
			NotificationChain msgs = null;
			if (angabenKind != null)
				msgs = ((InternalEObject)angabenKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND, null, msgs);
			if (newAngabenKind != null)
				msgs = ((InternalEObject)newAngabenKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND, null, msgs);
			msgs = basicSetAngabenKind(newAngabenKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND, newAngabenKind, newAngabenKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BegruendungDesHilfebedarfsType getBegruendungHZE() {
		return begruendungHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegruendungHZE(BegruendungDesHilfebedarfsType newBegruendungHZE, NotificationChain msgs) {
		BegruendungDesHilfebedarfsType oldBegruendungHZE = begruendungHZE;
		begruendungHZE = newBegruendungHZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE, oldBegruendungHZE, newBegruendungHZE);
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
	public void setBegruendungHZE(BegruendungDesHilfebedarfsType newBegruendungHZE) {
		if (newBegruendungHZE != begruendungHZE) {
			NotificationChain msgs = null;
			if (begruendungHZE != null)
				msgs = ((InternalEObject)begruendungHZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE, null, msgs);
			if (newBegruendungHZE != null)
				msgs = ((InternalEObject)newBegruendungHZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE, null, msgs);
			msgs = basicSetBegruendungHZE(newBegruendungHZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE, newBegruendungHZE, newBegruendungHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenElternteilEingliederungType> getAngabenElternteile() {
		if (angabenElternteile == null) {
			angabenElternteile = new EObjectContainmentEList<AngabenElternteilEingliederungType>(AngabenElternteilEingliederungType.class, this, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE);
		}
		return angabenElternteile;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO, newDsgvo, newDsgvo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, richtigkeitAngaben, !oldRichtigkeitAngabenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN, oldRichtigkeitAngaben, RICHTIGKEIT_ANGABEN_EDEFAULT, oldRichtigkeitAngabenESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, einwilligungZwischenspeichern, !oldEinwilligungZwischenspeichernESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT, oldEinwilligungZwischenspeichernESet));
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG:
				return basicSetAuswahlAnfrageEingliederung(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG:
				return basicSetAnliegensklaerungEingliederung(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return basicSetPersoenlicheAngabenZuIhrerPerson(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND:
				return basicSetAngabenKind(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE:
				return basicSetBegruendungHZE(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE:
				return ((InternalEList<?>)getAngabenElternteile()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG:
				return getAuswahlAnfrageEingliederung();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG:
				return getAnliegensklaerungEingliederung();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return getPersoenlicheAngabenZuIhrerPerson();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND:
				return getAngabenKind();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE:
				return getBegruendungHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE:
				return getAngabenElternteile();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO:
				return getDsgvo();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN:
				return isRichtigkeitAngaben();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
				return isEinwilligungZwischenspeichern();
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG:
				setAuswahlAnfrageEingliederung((CodeAuswahlDerHilfeHzEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG:
				setAnliegensklaerungEingliederung((AnliegensklaerungAnfrageType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenEingliederungType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND:
				setAngabenKind((AngabenKindEingliederungType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE:
				setBegruendungHZE((BegruendungDesHilfebedarfsType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE:
				getAngabenElternteile().clear();
				getAngabenElternteile().addAll((Collection<? extends AngabenElternteilEingliederungType>)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN:
				setRichtigkeitAngaben((Boolean)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG:
				setAuswahlAnfrageEingliederung((CodeAuswahlDerHilfeHzEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG:
				setAnliegensklaerungEingliederung((AnliegensklaerungAnfrageType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenEingliederungType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND:
				setAngabenKind((AngabenKindEingliederungType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE:
				setBegruendungHZE((BegruendungDesHilfebedarfsType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE:
				getAngabenElternteile().clear();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN:
				unsetRichtigkeitAngaben();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__AUSWAHL_ANFRAGE_EINGLIEDERUNG:
				return auswahlAnfrageEingliederung != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANLIEGENSKLAERUNG_EINGLIEDERUNG:
				return anliegensklaerungEingliederung != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return persoenlicheAngabenZuIhrerPerson != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_KIND:
				return angabenKind != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__BEGRUENDUNG_HZE:
				return begruendungHZE != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__ANGABEN_ELTERNTEILE:
				return angabenElternteile != null && !angabenElternteile.isEmpty();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__DSGVO:
				return dsgvo != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__RICHTIGKEIT_ANGABEN:
				return isSetRichtigkeitAngaben();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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

} //HilfenZurErziehungEingliederungshilfe0703TypeImpl

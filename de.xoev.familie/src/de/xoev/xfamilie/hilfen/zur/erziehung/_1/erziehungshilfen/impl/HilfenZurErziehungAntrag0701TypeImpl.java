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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenETType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAuswahlDerHilfeHzEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hilfen Zur Erziehung Antrag0701 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getAuswahlDerHilfeHZE <em>Auswahl Der Hilfe HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getAnliegensklaerungHZE <em>Anliegensklaerung HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getPruefcodeHZE <em>Pruefcode HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getAndererElternteil <em>Anderer Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getAngabenKindHZE <em>Angaben Kind HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getNachweiseHZE <em>Nachweise HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#getZusatzNachrichtHZE <em>Zusatz Nachricht HZE</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungAntrag0701TypeImpl#isEinwilligungZwischenspeichern <em>Einwilligung Zwischenspeichern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HilfenZurErziehungAntrag0701TypeImpl extends AntragsnachrichtTypeImpl implements HilfenZurErziehungAntrag0701Type {
	/**
	 * The cached value of the '{@link #getAuswahlDerHilfeHZE() <em>Auswahl Der Hilfe HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuswahlDerHilfeHZE()
	 * @generated
	 * @ordered
	 */
	protected CodeAuswahlDerHilfeHzEType auswahlDerHilfeHZE;

	/**
	 * The cached value of the '{@link #getAnliegensklaerungHZE() <em>Anliegensklaerung HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegensklaerungHZE()
	 * @generated
	 * @ordered
	 */
	protected AnliegensklaerungType anliegensklaerungHZE;

	/**
	 * The default value of the '{@link #getPruefcodeHZE() <em>Pruefcode HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefcodeHZE()
	 * @generated
	 * @ordered
	 */
	protected static final String PRUEFCODE_HZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPruefcodeHZE() <em>Pruefcode HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefcodeHZE()
	 * @generated
	 * @ordered
	 */
	protected String pruefcodeHZE = PRUEFCODE_HZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersoenlicheAngabenZuIhrerPerson() <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 * @ordered
	 */
	protected PersoenlicheAngabenHZEType persoenlicheAngabenZuIhrerPerson;

	/**
	 * The cached value of the '{@link #getAndererElternteil() <em>Anderer Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndererElternteil()
	 * @generated
	 * @ordered
	 */
	protected AngabenETType andererElternteil;

	/**
	 * The cached value of the '{@link #getAngabenKindHZE() <em>Angaben Kind HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenKindHZE()
	 * @generated
	 * @ordered
	 */
	protected AngabenKindHZEType angabenKindHZE;

	/**
	 * The cached value of the '{@link #getNachweiseHZE() <em>Nachweise HZE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweiseHZE()
	 * @generated
	 * @ordered
	 */
	protected NachweiseHZEType nachweiseHZE;

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
	 * The default value of the '{@link #getZusatzNachrichtHZE() <em>Zusatz Nachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzNachrichtHZE()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZ_NACHRICHT_HZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatzNachrichtHZE() <em>Zusatz Nachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzNachrichtHZE()
	 * @generated
	 * @ordered
	 */
	protected String zusatzNachrichtHZE = ZUSATZ_NACHRICHT_HZE_EDEFAULT;

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
	protected HilfenZurErziehungAntrag0701TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAuswahlDerHilfeHzEType getAuswahlDerHilfeHZE() {
		return auswahlDerHilfeHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuswahlDerHilfeHZE(CodeAuswahlDerHilfeHzEType newAuswahlDerHilfeHZE, NotificationChain msgs) {
		CodeAuswahlDerHilfeHzEType oldAuswahlDerHilfeHZE = auswahlDerHilfeHZE;
		auswahlDerHilfeHZE = newAuswahlDerHilfeHZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE, oldAuswahlDerHilfeHZE, newAuswahlDerHilfeHZE);
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
	public void setAuswahlDerHilfeHZE(CodeAuswahlDerHilfeHzEType newAuswahlDerHilfeHZE) {
		if (newAuswahlDerHilfeHZE != auswahlDerHilfeHZE) {
			NotificationChain msgs = null;
			if (auswahlDerHilfeHZE != null)
				msgs = ((InternalEObject)auswahlDerHilfeHZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE, null, msgs);
			if (newAuswahlDerHilfeHZE != null)
				msgs = ((InternalEObject)newAuswahlDerHilfeHZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE, null, msgs);
			msgs = basicSetAuswahlDerHilfeHZE(newAuswahlDerHilfeHZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE, newAuswahlDerHilfeHZE, newAuswahlDerHilfeHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungType getAnliegensklaerungHZE() {
		return anliegensklaerungHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegensklaerungHZE(AnliegensklaerungType newAnliegensklaerungHZE, NotificationChain msgs) {
		AnliegensklaerungType oldAnliegensklaerungHZE = anliegensklaerungHZE;
		anliegensklaerungHZE = newAnliegensklaerungHZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE, oldAnliegensklaerungHZE, newAnliegensklaerungHZE);
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
	public void setAnliegensklaerungHZE(AnliegensklaerungType newAnliegensklaerungHZE) {
		if (newAnliegensklaerungHZE != anliegensklaerungHZE) {
			NotificationChain msgs = null;
			if (anliegensklaerungHZE != null)
				msgs = ((InternalEObject)anliegensklaerungHZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE, null, msgs);
			if (newAnliegensklaerungHZE != null)
				msgs = ((InternalEObject)newAnliegensklaerungHZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE, null, msgs);
			msgs = basicSetAnliegensklaerungHZE(newAnliegensklaerungHZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE, newAnliegensklaerungHZE, newAnliegensklaerungHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPruefcodeHZE() {
		return pruefcodeHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPruefcodeHZE(String newPruefcodeHZE) {
		String oldPruefcodeHZE = pruefcodeHZE;
		pruefcodeHZE = newPruefcodeHZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE, oldPruefcodeHZE, pruefcodeHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenHZEType getPersoenlicheAngabenZuIhrerPerson() {
		return persoenlicheAngabenZuIhrerPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType newPersoenlicheAngabenZuIhrerPerson, NotificationChain msgs) {
		PersoenlicheAngabenHZEType oldPersoenlicheAngabenZuIhrerPerson = persoenlicheAngabenZuIhrerPerson;
		persoenlicheAngabenZuIhrerPerson = newPersoenlicheAngabenZuIhrerPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, oldPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson);
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
	public void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType newPersoenlicheAngabenZuIhrerPerson) {
		if (newPersoenlicheAngabenZuIhrerPerson != persoenlicheAngabenZuIhrerPerson) {
			NotificationChain msgs = null;
			if (persoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)persoenlicheAngabenZuIhrerPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			if (newPersoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)newPersoenlicheAngabenZuIhrerPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			msgs = basicSetPersoenlicheAngabenZuIhrerPerson(newPersoenlicheAngabenZuIhrerPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, newPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenETType getAndererElternteil() {
		return andererElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndererElternteil(AngabenETType newAndererElternteil, NotificationChain msgs) {
		AngabenETType oldAndererElternteil = andererElternteil;
		andererElternteil = newAndererElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL, oldAndererElternteil, newAndererElternteil);
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
	public void setAndererElternteil(AngabenETType newAndererElternteil) {
		if (newAndererElternteil != andererElternteil) {
			NotificationChain msgs = null;
			if (andererElternteil != null)
				msgs = ((InternalEObject)andererElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL, null, msgs);
			if (newAndererElternteil != null)
				msgs = ((InternalEObject)newAndererElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL, null, msgs);
			msgs = basicSetAndererElternteil(newAndererElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL, newAndererElternteil, newAndererElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindHZEType getAngabenKindHZE() {
		return angabenKindHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenKindHZE(AngabenKindHZEType newAngabenKindHZE, NotificationChain msgs) {
		AngabenKindHZEType oldAngabenKindHZE = angabenKindHZE;
		angabenKindHZE = newAngabenKindHZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE, oldAngabenKindHZE, newAngabenKindHZE);
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
	public void setAngabenKindHZE(AngabenKindHZEType newAngabenKindHZE) {
		if (newAngabenKindHZE != angabenKindHZE) {
			NotificationChain msgs = null;
			if (angabenKindHZE != null)
				msgs = ((InternalEObject)angabenKindHZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE, null, msgs);
			if (newAngabenKindHZE != null)
				msgs = ((InternalEObject)newAngabenKindHZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE, null, msgs);
			msgs = basicSetAngabenKindHZE(newAngabenKindHZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE, newAngabenKindHZE, newAngabenKindHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseHZEType getNachweiseHZE() {
		return nachweiseHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweiseHZE(NachweiseHZEType newNachweiseHZE, NotificationChain msgs) {
		NachweiseHZEType oldNachweiseHZE = nachweiseHZE;
		nachweiseHZE = newNachweiseHZE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE, oldNachweiseHZE, newNachweiseHZE);
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
	public void setNachweiseHZE(NachweiseHZEType newNachweiseHZE) {
		if (newNachweiseHZE != nachweiseHZE) {
			NotificationChain msgs = null;
			if (nachweiseHZE != null)
				msgs = ((InternalEObject)nachweiseHZE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE, null, msgs);
			if (newNachweiseHZE != null)
				msgs = ((InternalEObject)newNachweiseHZE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE, null, msgs);
			msgs = basicSetNachweiseHZE(newNachweiseHZE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE, newNachweiseHZE, newNachweiseHZE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatzNachrichtHZE() {
		return zusatzNachrichtHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatzNachrichtHZE(String newZusatzNachrichtHZE) {
		String oldZusatzNachrichtHZE = zusatzNachrichtHZE;
		zusatzNachrichtHZE = newZusatzNachrichtHZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE, oldZusatzNachrichtHZE, zusatzNachrichtHZE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, einwilligungZwischenspeichern, !oldEinwilligungZwischenspeichernESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN, oldEinwilligungZwischenspeichern, EINWILLIGUNG_ZWISCHENSPEICHERN_EDEFAULT, oldEinwilligungZwischenspeichernESet));
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE:
				return basicSetAuswahlDerHilfeHZE(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE:
				return basicSetAnliegensklaerungHZE(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return basicSetPersoenlicheAngabenZuIhrerPerson(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL:
				return basicSetAndererElternteil(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE:
				return basicSetAngabenKindHZE(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE:
				return basicSetNachweiseHZE(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE:
				return getAuswahlDerHilfeHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE:
				return getAnliegensklaerungHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE:
				return getPruefcodeHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return getPersoenlicheAngabenZuIhrerPerson();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL:
				return getAndererElternteil();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE:
				return getAngabenKindHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE:
				return getNachweiseHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO:
				return getDsgvo();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE:
				return getZusatzNachrichtHZE();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE:
				setAuswahlDerHilfeHZE((CodeAuswahlDerHilfeHzEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE:
				setAnliegensklaerungHZE((AnliegensklaerungType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE:
				setPruefcodeHZE((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL:
				setAndererElternteil((AngabenETType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE:
				setAngabenKindHZE((AngabenKindHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE:
				setNachweiseHZE((NachweiseHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE:
				setZusatzNachrichtHZE((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE:
				setAuswahlDerHilfeHZE((CodeAuswahlDerHilfeHzEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE:
				setAnliegensklaerungHZE((AnliegensklaerungType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE:
				setPruefcodeHZE(PRUEFCODE_HZE_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL:
				setAndererElternteil((AngabenETType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE:
				setAngabenKindHZE((AngabenKindHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE:
				setNachweiseHZE((NachweiseHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE:
				setZusatzNachrichtHZE(ZUSATZ_NACHRICHT_HZE_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__AUSWAHL_DER_HILFE_HZE:
				return auswahlDerHilfeHZE != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANLIEGENSKLAERUNG_HZE:
				return anliegensklaerungHZE != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PRUEFCODE_HZE:
				return PRUEFCODE_HZE_EDEFAULT == null ? pruefcodeHZE != null : !PRUEFCODE_HZE_EDEFAULT.equals(pruefcodeHZE);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return persoenlicheAngabenZuIhrerPerson != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANDERER_ELTERNTEIL:
				return andererElternteil != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ANGABEN_KIND_HZE:
				return angabenKindHZE != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__NACHWEISE_HZE:
				return nachweiseHZE != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__DSGVO:
				return dsgvo != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__ZUSATZ_NACHRICHT_HZE:
				return ZUSATZ_NACHRICHT_HZE_EDEFAULT == null ? zusatzNachrichtHZE != null : !ZUSATZ_NACHRICHT_HZE_EDEFAULT.equals(zusatzNachrichtHZE);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_ANTRAG0701_TYPE__EINWILLIGUNG_ZWISCHENSPEICHERN:
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
		result.append(" (pruefcodeHZE: ");
		result.append(pruefcodeHZE);
		result.append(", zusatzNachrichtHZE: ");
		result.append(zusatzNachrichtHZE);
		result.append(", einwilligungZwischenspeichern: ");
		if (einwilligungZwischenspeichernESet) result.append(einwilligungZwischenspeichern); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HilfenZurErziehungAntrag0701TypeImpl

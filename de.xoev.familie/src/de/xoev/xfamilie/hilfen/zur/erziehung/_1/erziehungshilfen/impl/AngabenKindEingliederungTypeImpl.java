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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindEingliederungType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeAufenthaltType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Kind Eingliederung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getAufenthaltsort <em>Aufenthaltsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getJugendlichAufenthaltsortSonstige <em>Jugendlich Aufenthaltsort Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getAktuelleAnschrift <em>Aktuelle Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#isAnschriftsaenderung <em>Anschriftsaenderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#isSeelischeBehinderung <em>Seelische Behinderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#getArtDerBehinderung <em>Art Der Behinderung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AngabenKindEingliederungTypeImpl#isAerztlicherNachweis <em>Aerztlicher Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenKindEingliederungTypeImpl extends MinimalEObjectImpl.Container implements AngabenKindEingliederungType {
	/**
	 * The cached value of the '{@link #getNamen() <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamen()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonVornameVerpflichtendType namen;

	/**
	 * The default value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GEBURTSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsdatum() <em>Geburtsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar geburtsdatum = GEBURTSDATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected CodeGeschlechtType geschlecht;

	/**
	 * The cached value of the '{@link #getAufenthaltsort() <em>Aufenthaltsort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsort()
	 * @generated
	 * @ordered
	 */
	protected CodeAufenthaltType aufenthaltsort;

	/**
	 * The default value of the '{@link #getJugendlichAufenthaltsortSonstige() <em>Jugendlich Aufenthaltsort Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendlichAufenthaltsortSonstige()
	 * @generated
	 * @ordered
	 */
	protected static final String JUGENDLICH_AUFENTHALTSORT_SONSTIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJugendlichAufenthaltsortSonstige() <em>Jugendlich Aufenthaltsort Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendlichAufenthaltsortSonstige()
	 * @generated
	 * @ordered
	 */
	protected String jugendlichAufenthaltsortSonstige = JUGENDLICH_AUFENTHALTSORT_SONSTIGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAktuelleAnschrift() <em>Aktuelle Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuelleAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType aktuelleAnschrift;

	/**
	 * The default value of the '{@link #isAnschriftsaenderung() <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftsaenderung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSCHRIFTSAENDERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnschriftsaenderung() <em>Anschriftsaenderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftsaenderung()
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftsaenderung = ANSCHRIFTSAENDERUNG_EDEFAULT;

	/**
	 * This is true if the Anschriftsaenderung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftsaenderungESet;

	/**
	 * The default value of the '{@link #isSeelischeBehinderung() <em>Seelische Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeelischeBehinderung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEELISCHE_BEHINDERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeelischeBehinderung() <em>Seelische Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeelischeBehinderung()
	 * @generated
	 * @ordered
	 */
	protected boolean seelischeBehinderung = SEELISCHE_BEHINDERUNG_EDEFAULT;

	/**
	 * This is true if the Seelische Behinderung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seelischeBehinderungESet;

	/**
	 * The default value of the '{@link #getArtDerBehinderung() <em>Art Der Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDerBehinderung()
	 * @generated
	 * @ordered
	 */
	protected static final String ART_DER_BEHINDERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtDerBehinderung() <em>Art Der Behinderung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDerBehinderung()
	 * @generated
	 * @ordered
	 */
	protected String artDerBehinderung = ART_DER_BEHINDERUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #isAerztlicherNachweis() <em>Aerztlicher Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAerztlicherNachweis()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AERZTLICHER_NACHWEIS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAerztlicherNachweis() <em>Aerztlicher Nachweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAerztlicherNachweis()
	 * @generated
	 * @ordered
	 */
	protected boolean aerztlicherNachweis = AERZTLICHER_NACHWEIS_EDEFAULT;

	/**
	 * This is true if the Aerztlicher Nachweis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aerztlicherNachweisESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenKindEingliederungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANGABEN_KIND_EINGLIEDERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonVornameVerpflichtendType getNamen() {
		return namen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamen(NameNatuerlichePersonVornameVerpflichtendType newNamen, NotificationChain msgs) {
		NameNatuerlichePersonVornameVerpflichtendType oldNamen = namen;
		namen = newNamen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN, oldNamen, newNamen);
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
	public void setNamen(NameNatuerlichePersonVornameVerpflichtendType newNamen) {
		if (newNamen != namen) {
			NotificationChain msgs = null;
			if (namen != null)
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN, newNamen, newNamen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getGeburtsdatum() {
		return geburtsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsdatum(XMLGregorianCalendar newGeburtsdatum) {
		XMLGregorianCalendar oldGeburtsdatum = geburtsdatum;
		geburtsdatum = newGeburtsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschlecht(CodeGeschlechtType newGeschlecht, NotificationChain msgs) {
		CodeGeschlechtType oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
	public void setGeschlecht(CodeGeschlechtType newGeschlecht) {
		if (newGeschlecht != geschlecht) {
			NotificationChain msgs = null;
			if (geschlecht != null)
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAufenthaltType getAufenthaltsort() {
		return aufenthaltsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufenthaltsort(CodeAufenthaltType newAufenthaltsort, NotificationChain msgs) {
		CodeAufenthaltType oldAufenthaltsort = aufenthaltsort;
		aufenthaltsort = newAufenthaltsort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT, oldAufenthaltsort, newAufenthaltsort);
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
	public void setAufenthaltsort(CodeAufenthaltType newAufenthaltsort) {
		if (newAufenthaltsort != aufenthaltsort) {
			NotificationChain msgs = null;
			if (aufenthaltsort != null)
				msgs = ((InternalEObject)aufenthaltsort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT, null, msgs);
			if (newAufenthaltsort != null)
				msgs = ((InternalEObject)newAufenthaltsort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT, null, msgs);
			msgs = basicSetAufenthaltsort(newAufenthaltsort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT, newAufenthaltsort, newAufenthaltsort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJugendlichAufenthaltsortSonstige() {
		return jugendlichAufenthaltsortSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJugendlichAufenthaltsortSonstige(String newJugendlichAufenthaltsortSonstige) {
		String oldJugendlichAufenthaltsortSonstige = jugendlichAufenthaltsortSonstige;
		jugendlichAufenthaltsortSonstige = newJugendlichAufenthaltsortSonstige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE, oldJugendlichAufenthaltsortSonstige, jugendlichAufenthaltsortSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAktuelleAnschrift() {
		return aktuelleAnschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAktuelleAnschrift(PostalischeInlandsanschriftBasisType newAktuelleAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAktuelleAnschrift = aktuelleAnschrift;
		aktuelleAnschrift = newAktuelleAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, oldAktuelleAnschrift, newAktuelleAnschrift);
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
	public void setAktuelleAnschrift(PostalischeInlandsanschriftBasisType newAktuelleAnschrift) {
		if (newAktuelleAnschrift != aktuelleAnschrift) {
			NotificationChain msgs = null;
			if (aktuelleAnschrift != null)
				msgs = ((InternalEObject)aktuelleAnschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			if (newAktuelleAnschrift != null)
				msgs = ((InternalEObject)newAktuelleAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, null, msgs);
			msgs = basicSetAktuelleAnschrift(newAktuelleAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT, newAktuelleAnschrift, newAktuelleAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnschriftsaenderung() {
		return anschriftsaenderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschriftsaenderung(boolean newAnschriftsaenderung) {
		boolean oldAnschriftsaenderung = anschriftsaenderung;
		anschriftsaenderung = newAnschriftsaenderung;
		boolean oldAnschriftsaenderungESet = anschriftsaenderungESet;
		anschriftsaenderungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, anschriftsaenderung, !oldAnschriftsaenderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnschriftsaenderung() {
		boolean oldAnschriftsaenderung = anschriftsaenderung;
		boolean oldAnschriftsaenderungESet = anschriftsaenderungESet;
		anschriftsaenderung = ANSCHRIFTSAENDERUNG_EDEFAULT;
		anschriftsaenderungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG, oldAnschriftsaenderung, ANSCHRIFTSAENDERUNG_EDEFAULT, oldAnschriftsaenderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnschriftsaenderung() {
		return anschriftsaenderungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSeelischeBehinderung() {
		return seelischeBehinderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeelischeBehinderung(boolean newSeelischeBehinderung) {
		boolean oldSeelischeBehinderung = seelischeBehinderung;
		seelischeBehinderung = newSeelischeBehinderung;
		boolean oldSeelischeBehinderungESet = seelischeBehinderungESet;
		seelischeBehinderungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG, oldSeelischeBehinderung, seelischeBehinderung, !oldSeelischeBehinderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSeelischeBehinderung() {
		boolean oldSeelischeBehinderung = seelischeBehinderung;
		boolean oldSeelischeBehinderungESet = seelischeBehinderungESet;
		seelischeBehinderung = SEELISCHE_BEHINDERUNG_EDEFAULT;
		seelischeBehinderungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG, oldSeelischeBehinderung, SEELISCHE_BEHINDERUNG_EDEFAULT, oldSeelischeBehinderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSeelischeBehinderung() {
		return seelischeBehinderungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtDerBehinderung() {
		return artDerBehinderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtDerBehinderung(String newArtDerBehinderung) {
		String oldArtDerBehinderung = artDerBehinderung;
		artDerBehinderung = newArtDerBehinderung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG, oldArtDerBehinderung, artDerBehinderung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAerztlicherNachweis() {
		return aerztlicherNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAerztlicherNachweis(boolean newAerztlicherNachweis) {
		boolean oldAerztlicherNachweis = aerztlicherNachweis;
		aerztlicherNachweis = newAerztlicherNachweis;
		boolean oldAerztlicherNachweisESet = aerztlicherNachweisESet;
		aerztlicherNachweisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS, oldAerztlicherNachweis, aerztlicherNachweis, !oldAerztlicherNachweisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAerztlicherNachweis() {
		boolean oldAerztlicherNachweis = aerztlicherNachweis;
		boolean oldAerztlicherNachweisESet = aerztlicherNachweisESet;
		aerztlicherNachweis = AERZTLICHER_NACHWEIS_EDEFAULT;
		aerztlicherNachweisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS, oldAerztlicherNachweis, AERZTLICHER_NACHWEIS_EDEFAULT, oldAerztlicherNachweisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAerztlicherNachweis() {
		return aerztlicherNachweisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT:
				return basicSetAufenthaltsort(null, msgs);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return basicSetAktuelleAnschrift(null, msgs);
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
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN:
				return getNamen();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT:
				return getGeschlecht();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT:
				return getAufenthaltsort();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE:
				return getJugendlichAufenthaltsortSonstige();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return getAktuelleAnschrift();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG:
				return isAnschriftsaenderung();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG:
				return isSeelischeBehinderung();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG:
				return getArtDerBehinderung();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS:
				return isAerztlicherNachweis();
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
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT:
				setAufenthaltsort((CodeAufenthaltType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE:
				setJugendlichAufenthaltsortSonstige((String)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG:
				setAnschriftsaenderung((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG:
				setSeelischeBehinderung((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG:
				setArtDerBehinderung((String)newValue);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS:
				setAerztlicherNachweis((Boolean)newValue);
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
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT:
				setAufenthaltsort((CodeAufenthaltType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE:
				setJugendlichAufenthaltsortSonstige(JUGENDLICH_AUFENTHALTSORT_SONSTIGE_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				setAktuelleAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG:
				unsetAnschriftsaenderung();
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG:
				unsetSeelischeBehinderung();
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG:
				setArtDerBehinderung(ART_DER_BEHINDERUNG_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS:
				unsetAerztlicherNachweis();
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
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__NAMEN:
				return namen != null;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__GESCHLECHT:
				return geschlecht != null;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AUFENTHALTSORT:
				return aufenthaltsort != null;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__JUGENDLICH_AUFENTHALTSORT_SONSTIGE:
				return JUGENDLICH_AUFENTHALTSORT_SONSTIGE_EDEFAULT == null ? jugendlichAufenthaltsortSonstige != null : !JUGENDLICH_AUFENTHALTSORT_SONSTIGE_EDEFAULT.equals(jugendlichAufenthaltsortSonstige);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AKTUELLE_ANSCHRIFT:
				return aktuelleAnschrift != null;
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ANSCHRIFTSAENDERUNG:
				return isSetAnschriftsaenderung();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__SEELISCHE_BEHINDERUNG:
				return isSetSeelischeBehinderung();
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__ART_DER_BEHINDERUNG:
				return ART_DER_BEHINDERUNG_EDEFAULT == null ? artDerBehinderung != null : !ART_DER_BEHINDERUNG_EDEFAULT.equals(artDerBehinderung);
			case ErziehungshilfePackage.ANGABEN_KIND_EINGLIEDERUNG_TYPE__AERZTLICHER_NACHWEIS:
				return isSetAerztlicherNachweis();
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
		result.append(" (geburtsdatum: ");
		result.append(geburtsdatum);
		result.append(", jugendlichAufenthaltsortSonstige: ");
		result.append(jugendlichAufenthaltsortSonstige);
		result.append(", anschriftsaenderung: ");
		if (anschriftsaenderungESet) result.append(anschriftsaenderung); else result.append("<unset>");
		result.append(", seelischeBehinderung: ");
		if (seelischeBehinderungESet) result.append(seelischeBehinderung); else result.append("<unset>");
		result.append(", artDerBehinderung: ");
		result.append(artDerBehinderung);
		result.append(", aerztlicherNachweis: ");
		if (aerztlicherNachweisESet) result.append(aerztlicherNachweis); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenKindEingliederungTypeImpl

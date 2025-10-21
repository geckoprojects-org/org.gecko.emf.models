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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.PersoenlicheAngabenETType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.StaatsangehoerigkeitType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Persoenliche Angaben ET Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#isVerheiratetVerpartnertMitET <em>Verheiratet Verpartnert Mit ET</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#isUnverheiratetesZusammenleben <em>Unverheiratetes Zusammenleben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#isAlleinerziehend <em>Alleinerziehend</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getNachweisPersonalausweisPass <em>Nachweis Personalausweis Pass</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.PersoenlicheAngabenETTypeImpl#getMeldedatenabgleich <em>Meldedatenabgleich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersoenlicheAngabenETTypeImpl extends MinimalEObjectImpl.Container implements PersoenlicheAngabenETType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonNachweisbezugType name;

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
	 * The default value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTSORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtsort() <em>Geburtsort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsort()
	 * @generated
	 * @ordered
	 */
	protected String geburtsort = GEBURTSORT_EDEFAULT;

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
	 * The cached value of the '{@link #getFamilienstand() <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected FamilienstandNachweisbezugType familienstand;

	/**
	 * The default value of the '{@link #isVerheiratetVerpartnertMitET() <em>Verheiratet Verpartnert Mit ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerheiratetVerpartnertMitET()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERHEIRATET_VERPARTNERT_MIT_ET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerheiratetVerpartnertMitET() <em>Verheiratet Verpartnert Mit ET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerheiratetVerpartnertMitET()
	 * @generated
	 * @ordered
	 */
	protected boolean verheiratetVerpartnertMitET = VERHEIRATET_VERPARTNERT_MIT_ET_EDEFAULT;

	/**
	 * This is true if the Verheiratet Verpartnert Mit ET attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verheiratetVerpartnertMitETESet;

	/**
	 * The default value of the '{@link #isUnverheiratetesZusammenleben() <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnverheiratetesZusammenleben() <em>Unverheiratetes Zusammenleben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnverheiratetesZusammenleben()
	 * @generated
	 * @ordered
	 */
	protected boolean unverheiratetesZusammenleben = UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT;

	/**
	 * This is true if the Unverheiratetes Zusammenleben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unverheiratetesZusammenlebenESet;

	/**
	 * The default value of the '{@link #isAlleinerziehend() <em>Alleinerziehend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlleinerziehend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLEINERZIEHEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlleinerziehend() <em>Alleinerziehend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlleinerziehend()
	 * @generated
	 * @ordered
	 */
	protected boolean alleinerziehend = ALLEINERZIEHEND_EDEFAULT;

	/**
	 * This is true if the Alleinerziehend attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alleinerziehendESet;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected StaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * The cached value of the '{@link #getNachweisPersonalausweisPass() <em>Nachweis Personalausweis Pass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisPersonalausweisPass()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisPersonalausweisPass;

	/**
	 * The cached value of the '{@link #getMeldedatenabgleich() <em>Meldedatenabgleich</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeldedatenabgleich()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> meldedatenabgleich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersoenlicheAngabenETTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getPersoenlicheAngabenETType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonNachweisbezugType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonNachweisbezugType newName, NotificationChain msgs) {
		NameNatuerlichePersonNachweisbezugType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME, oldName, newName);
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
	public void setName(NameNatuerlichePersonNachweisbezugType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME, newName, newName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtsort() {
		return geburtsort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtsort(String newGeburtsort) {
		String oldGeburtsort = geburtsort;
		geburtsort = newGeburtsort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT, oldGeburtsort, geburtsort));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandNachweisbezugType getFamilienstand() {
		return familienstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilienstand(FamilienstandNachweisbezugType newFamilienstand, NotificationChain msgs) {
		FamilienstandNachweisbezugType oldFamilienstand = familienstand;
		familienstand = newFamilienstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND, oldFamilienstand, newFamilienstand);
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
	public void setFamilienstand(FamilienstandNachweisbezugType newFamilienstand) {
		if (newFamilienstand != familienstand) {
			NotificationChain msgs = null;
			if (familienstand != null)
				msgs = ((InternalEObject)familienstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND, null, msgs);
			if (newFamilienstand != null)
				msgs = ((InternalEObject)newFamilienstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND, null, msgs);
			msgs = basicSetFamilienstand(newFamilienstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND, newFamilienstand, newFamilienstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerheiratetVerpartnertMitET() {
		return verheiratetVerpartnertMitET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerheiratetVerpartnertMitET(boolean newVerheiratetVerpartnertMitET) {
		boolean oldVerheiratetVerpartnertMitET = verheiratetVerpartnertMitET;
		verheiratetVerpartnertMitET = newVerheiratetVerpartnertMitET;
		boolean oldVerheiratetVerpartnertMitETESet = verheiratetVerpartnertMitETESet;
		verheiratetVerpartnertMitETESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET, oldVerheiratetVerpartnertMitET, verheiratetVerpartnertMitET, !oldVerheiratetVerpartnertMitETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerheiratetVerpartnertMitET() {
		boolean oldVerheiratetVerpartnertMitET = verheiratetVerpartnertMitET;
		boolean oldVerheiratetVerpartnertMitETESet = verheiratetVerpartnertMitETESet;
		verheiratetVerpartnertMitET = VERHEIRATET_VERPARTNERT_MIT_ET_EDEFAULT;
		verheiratetVerpartnertMitETESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET, oldVerheiratetVerpartnertMitET, VERHEIRATET_VERPARTNERT_MIT_ET_EDEFAULT, oldVerheiratetVerpartnertMitETESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerheiratetVerpartnertMitET() {
		return verheiratetVerpartnertMitETESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnverheiratetesZusammenleben() {
		return unverheiratetesZusammenleben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnverheiratetesZusammenleben(boolean newUnverheiratetesZusammenleben) {
		boolean oldUnverheiratetesZusammenleben = unverheiratetesZusammenleben;
		unverheiratetesZusammenleben = newUnverheiratetesZusammenleben;
		boolean oldUnverheiratetesZusammenlebenESet = unverheiratetesZusammenlebenESet;
		unverheiratetesZusammenlebenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN, oldUnverheiratetesZusammenleben, unverheiratetesZusammenleben, !oldUnverheiratetesZusammenlebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnverheiratetesZusammenleben() {
		boolean oldUnverheiratetesZusammenleben = unverheiratetesZusammenleben;
		boolean oldUnverheiratetesZusammenlebenESet = unverheiratetesZusammenlebenESet;
		unverheiratetesZusammenleben = UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT;
		unverheiratetesZusammenlebenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN, oldUnverheiratetesZusammenleben, UNVERHEIRATETES_ZUSAMMENLEBEN_EDEFAULT, oldUnverheiratetesZusammenlebenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnverheiratetesZusammenleben() {
		return unverheiratetesZusammenlebenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlleinerziehend() {
		return alleinerziehend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlleinerziehend(boolean newAlleinerziehend) {
		boolean oldAlleinerziehend = alleinerziehend;
		alleinerziehend = newAlleinerziehend;
		boolean oldAlleinerziehendESet = alleinerziehendESet;
		alleinerziehendESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND, oldAlleinerziehend, alleinerziehend, !oldAlleinerziehendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlleinerziehend() {
		boolean oldAlleinerziehend = alleinerziehend;
		boolean oldAlleinerziehendESet = alleinerziehendESet;
		alleinerziehend = ALLEINERZIEHEND_EDEFAULT;
		alleinerziehendESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND, oldAlleinerziehend, ALLEINERZIEHEND_EDEFAULT, oldAlleinerziehendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAlleinerziehend() {
		return alleinerziehendESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		StaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(StaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisPersonalausweisPass() {
		if (nachweisPersonalausweisPass == null) {
			nachweisPersonalausweisPass = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS);
		}
		return nachweisPersonalausweisPass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getMeldedatenabgleich() {
		if (meldedatenabgleich == null) {
			meldedatenabgleich = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH);
		}
		return meldedatenabgleich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME:
				return basicSetName(null, msgs);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND:
				return basicSetFamilienstand(null, msgs);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS:
				return ((InternalEList<?>)getNachweisPersonalausweisPass()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH:
				return ((InternalEList<?>)getMeldedatenabgleich()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME:
				return getName();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT:
				return getGeburtsort();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT:
				return getGeschlecht();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND:
				return getFamilienstand();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET:
				return isVerheiratetVerpartnertMitET();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				return isUnverheiratetesZusammenleben();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND:
				return isAlleinerziehend();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS:
				return getNachweisPersonalausweisPass();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH:
				return getMeldedatenabgleich();
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
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME:
				setName((NameNatuerlichePersonNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT:
				setGeburtsort((String)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandNachweisbezugType)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET:
				setVerheiratetVerpartnertMitET((Boolean)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				setUnverheiratetesZusammenleben((Boolean)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND:
				setAlleinerziehend((Boolean)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS:
				getNachweisPersonalausweisPass().clear();
				getNachweisPersonalausweisPass().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH:
				getMeldedatenabgleich().clear();
				getMeldedatenabgleich().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME:
				setName((NameNatuerlichePersonNachweisbezugType)null);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT:
				setGeburtsort(GEBURTSORT_EDEFAULT);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandNachweisbezugType)null);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET:
				unsetVerheiratetVerpartnertMitET();
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				unsetUnverheiratetesZusammenleben();
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND:
				unsetAlleinerziehend();
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((StaatsangehoerigkeitType)null);
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS:
				getNachweisPersonalausweisPass().clear();
				return;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH:
				getMeldedatenabgleich().clear();
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
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NAME:
				return name != null;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GEBURTSORT:
				return GEBURTSORT_EDEFAULT == null ? geburtsort != null : !GEBURTSORT_EDEFAULT.equals(geburtsort);
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__GESCHLECHT:
				return geschlecht != null;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__FAMILIENSTAND:
				return familienstand != null;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__VERHEIRATET_VERPARTNERT_MIT_ET:
				return isSetVerheiratetVerpartnertMitET();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__UNVERHEIRATETES_ZUSAMMENLEBEN:
				return isSetUnverheiratetesZusammenleben();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__ALLEINERZIEHEND:
				return isSetAlleinerziehend();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__NACHWEIS_PERSONALAUSWEIS_PASS:
				return nachweisPersonalausweisPass != null && !nachweisPersonalausweisPass.isEmpty();
			case ElterngeldPackage.PERSOENLICHE_ANGABEN_ET_TYPE__MELDEDATENABGLEICH:
				return meldedatenabgleich != null && !meldedatenabgleich.isEmpty();
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
		result.append(", geburtsort: ");
		result.append(geburtsort);
		result.append(", verheiratetVerpartnertMitET: ");
		if (verheiratetVerpartnertMitETESet) result.append(verheiratetVerpartnertMitET); else result.append("<unset>");
		result.append(", unverheiratetesZusammenleben: ");
		if (unverheiratetesZusammenlebenESet) result.append(unverheiratetesZusammenleben); else result.append("<unset>");
		result.append(", alleinerziehend: ");
		if (alleinerziehendESet) result.append(alleinerziehend); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PersoenlicheAngabenETTypeImpl

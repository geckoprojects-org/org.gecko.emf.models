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

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AntragstellenderETType;
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
 * An implementation of the model object '<em><b>Antragstellender ET Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getGeburtsort <em>Geburtsort</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getGeburtsdatum <em>Geburtsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#isAbweichendeAdresse <em>Abweichende Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AntragstellenderETTypeImpl#getKontaktdaten <em>Kontaktdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragstellenderETTypeImpl extends MinimalEObjectImpl.Container implements AntragstellenderETType {
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
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType adresse;

	/**
	 * The default value of the '{@link #isAbweichendeAdresse() <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbweichendeAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABWEICHENDE_ADRESSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbweichendeAdresse() <em>Abweichende Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbweichendeAdresse()
	 * @generated
	 * @ordered
	 */
	protected boolean abweichendeAdresse = ABWEICHENDE_ADRESSE_EDEFAULT;

	/**
	 * This is true if the Abweichende Adresse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abweichendeAdresseESet;

	/**
	 * The cached value of the '{@link #getAbweichendeAdressePerso() <em>Abweichende Adresse Perso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbweichendeAdressePerso()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType abweichendeAdressePerso;

	/**
	 * The cached value of the '{@link #getKontaktdaten() <em>Kontaktdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktdaten()
	 * @generated
	 * @ordered
	 */
	protected ErreichbarkeitType kontaktdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragstellenderETTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANTRAGSTELLENDER_ET_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN, oldNamen, newNamen);
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
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN, newNamen, newNamen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT, oldGeburtsort, geburtsort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM, oldGeburtsdatum, geburtsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresse(PostalischeInlandsanschriftBasisType newAdresse, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE, oldAdresse, newAdresse);
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
	public void setAdresse(PostalischeInlandsanschriftBasisType newAdresse) {
		if (newAdresse != adresse) {
			NotificationChain msgs = null;
			if (adresse != null)
				msgs = ((InternalEObject)adresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE, null, msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject)newAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE, null, msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE, newAdresse, newAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbweichendeAdresse() {
		return abweichendeAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbweichendeAdresse(boolean newAbweichendeAdresse) {
		boolean oldAbweichendeAdresse = abweichendeAdresse;
		abweichendeAdresse = newAbweichendeAdresse;
		boolean oldAbweichendeAdresseESet = abweichendeAdresseESet;
		abweichendeAdresseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE, oldAbweichendeAdresse, abweichendeAdresse, !oldAbweichendeAdresseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAbweichendeAdresse() {
		boolean oldAbweichendeAdresse = abweichendeAdresse;
		boolean oldAbweichendeAdresseESet = abweichendeAdresseESet;
		abweichendeAdresse = ABWEICHENDE_ADRESSE_EDEFAULT;
		abweichendeAdresseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE, oldAbweichendeAdresse, ABWEICHENDE_ADRESSE_EDEFAULT, oldAbweichendeAdresseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAbweichendeAdresse() {
		return abweichendeAdresseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAbweichendeAdressePerso() {
		return abweichendeAdressePerso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType newAbweichendeAdressePerso, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAbweichendeAdressePerso = abweichendeAdressePerso;
		abweichendeAdressePerso = newAbweichendeAdressePerso;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO, oldAbweichendeAdressePerso, newAbweichendeAdressePerso);
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
	public void setAbweichendeAdressePerso(PostalischeInlandsanschriftBasisType newAbweichendeAdressePerso) {
		if (newAbweichendeAdressePerso != abweichendeAdressePerso) {
			NotificationChain msgs = null;
			if (abweichendeAdressePerso != null)
				msgs = ((InternalEObject)abweichendeAdressePerso).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO, null, msgs);
			if (newAbweichendeAdressePerso != null)
				msgs = ((InternalEObject)newAbweichendeAdressePerso).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO, null, msgs);
			msgs = basicSetAbweichendeAdressePerso(newAbweichendeAdressePerso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO, newAbweichendeAdressePerso, newAbweichendeAdressePerso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErreichbarkeitType getKontaktdaten() {
		return kontaktdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktdaten(ErreichbarkeitType newKontaktdaten, NotificationChain msgs) {
		ErreichbarkeitType oldKontaktdaten = kontaktdaten;
		kontaktdaten = newKontaktdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN, oldKontaktdaten, newKontaktdaten);
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
	public void setKontaktdaten(ErreichbarkeitType newKontaktdaten) {
		if (newKontaktdaten != kontaktdaten) {
			NotificationChain msgs = null;
			if (kontaktdaten != null)
				msgs = ((InternalEObject)kontaktdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN, null, msgs);
			if (newKontaktdaten != null)
				msgs = ((InternalEObject)newKontaktdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN, null, msgs);
			msgs = basicSetKontaktdaten(newKontaktdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN, newKontaktdaten, newKontaktdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE:
				return basicSetAdresse(null, msgs);
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return basicSetAbweichendeAdressePerso(null, msgs);
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN:
				return basicSetKontaktdaten(null, msgs);
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
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN:
				return getNamen();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT:
				return getGeburtsort();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM:
				return getGeburtsdatum();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE:
				return getAdresse();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE:
				return isAbweichendeAdresse();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return getAbweichendeAdressePerso();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN:
				return getKontaktdaten();
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
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT:
				setGeburtsort((String)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM:
				setGeburtsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE:
				setAbweichendeAdresse((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				setAbweichendeAdressePerso((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN:
				setKontaktdaten((ErreichbarkeitType)newValue);
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
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonVornameVerpflichtendType)null);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT:
				setGeburtsort(GEBURTSORT_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM:
				setGeburtsdatum(GEBURTSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE:
				unsetAbweichendeAdresse();
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				setAbweichendeAdressePerso((PostalischeInlandsanschriftBasisType)null);
				return;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN:
				setKontaktdaten((ErreichbarkeitType)null);
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
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__NAMEN:
				return namen != null;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSORT:
				return GEBURTSORT_EDEFAULT == null ? geburtsort != null : !GEBURTSORT_EDEFAULT.equals(geburtsort);
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__GEBURTSDATUM:
				return GEBURTSDATUM_EDEFAULT == null ? geburtsdatum != null : !GEBURTSDATUM_EDEFAULT.equals(geburtsdatum);
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ADRESSE:
				return adresse != null;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE:
				return isSetAbweichendeAdresse();
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return abweichendeAdressePerso != null;
			case ErziehungshilfePackage.ANTRAGSTELLENDER_ET_TYPE__KONTAKTDATEN:
				return kontaktdaten != null;
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
		result.append(" (geburtsort: ");
		result.append(geburtsort);
		result.append(", geburtsdatum: ");
		result.append(geburtsdatum);
		result.append(", abweichendeAdresse: ");
		if (abweichendeAdresseESet) result.append(abweichendeAdresse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AntragstellenderETTypeImpl

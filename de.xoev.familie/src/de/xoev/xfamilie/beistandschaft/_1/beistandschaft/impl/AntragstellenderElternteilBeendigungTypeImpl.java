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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

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
 * An implementation of the model object '<em><b>Antragstellender Elternteil Beendigung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#isAbweichendeAdresse <em>Abweichende Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#getAbweichendeAdressePerso <em>Abweichende Adresse Perso</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AntragstellenderElternteilBeendigungTypeImpl#getAbweichendeAdresseNachweis <em>Abweichende Adresse Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragstellenderElternteilBeendigungTypeImpl extends MinimalEObjectImpl.Container implements AntragstellenderElternteilBeendigungType {
	/**
	 * The cached value of the '{@link #getNamen() <em>Namen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamen()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType namen;

	/**
	 * The cached value of the '{@link #getGeburtsdaten() <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdaten()
	 * @generated
	 * @ordered
	 */
	protected GeburtType geburtsdaten;

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
	 * The cached value of the '{@link #getAbweichendeAdresseNachweis() <em>Abweichende Adresse Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbweichendeAdresseNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> abweichendeAdresseNachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragstellenderElternteilBeendigungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNamen() {
		return namen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamen(NameNatuerlichePersonType newNamen, NotificationChain msgs) {
		NameNatuerlichePersonType oldNamen = namen;
		namen = newNamen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN, oldNamen, newNamen);
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
	public void setNamen(NameNatuerlichePersonType newNamen) {
		if (newNamen != namen) {
			NotificationChain msgs = null;
			if (namen != null)
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN, newNamen, newNamen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType getGeburtsdaten() {
		return geburtsdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdaten(GeburtType newGeburtsdaten, NotificationChain msgs) {
		GeburtType oldGeburtsdaten = geburtsdaten;
		geburtsdaten = newGeburtsdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN, oldGeburtsdaten, newGeburtsdaten);
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
	public void setGeburtsdaten(GeburtType newGeburtsdaten) {
		if (newGeburtsdaten != geburtsdaten) {
			NotificationChain msgs = null;
			if (geburtsdaten != null)
				msgs = ((InternalEObject)geburtsdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN, null, msgs);
			if (newGeburtsdaten != null)
				msgs = ((InternalEObject)newGeburtsdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN, null, msgs);
			msgs = basicSetGeburtsdaten(newGeburtsdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN, newGeburtsdaten, newGeburtsdaten));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE, oldAdresse, newAdresse);
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
				msgs = ((InternalEObject)adresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE, null, msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject)newAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE, null, msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE, newAdresse, newAdresse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE, oldAbweichendeAdresse, abweichendeAdresse, !oldAbweichendeAdresseESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE, oldAbweichendeAdresse, ABWEICHENDE_ADRESSE_EDEFAULT, oldAbweichendeAdresseESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO, oldAbweichendeAdressePerso, newAbweichendeAdressePerso);
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
				msgs = ((InternalEObject)abweichendeAdressePerso).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO, null, msgs);
			if (newAbweichendeAdressePerso != null)
				msgs = ((InternalEObject)newAbweichendeAdressePerso).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO, null, msgs);
			msgs = basicSetAbweichendeAdressePerso(newAbweichendeAdressePerso, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO, newAbweichendeAdressePerso, newAbweichendeAdressePerso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getAbweichendeAdresseNachweis() {
		if (abweichendeAdresseNachweis == null) {
			abweichendeAdresseNachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS);
		}
		return abweichendeAdresseNachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return basicSetGeburtsdaten(null, msgs);
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE:
				return basicSetAdresse(null, msgs);
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return basicSetAbweichendeAdressePerso(null, msgs);
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS:
				return ((InternalEList<?>)getAbweichendeAdresseNachweis()).basicRemove(otherEnd, msgs);
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
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN:
				return getNamen();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return getGeburtsdaten();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE:
				return getAdresse();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE:
				return isAbweichendeAdresse();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return getAbweichendeAdressePerso();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS:
				return getAbweichendeAdresseNachweis();
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
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonType)newValue);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)newValue);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE:
				setAbweichendeAdresse((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				setAbweichendeAdressePerso((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS:
				getAbweichendeAdresseNachweis().clear();
				getAbweichendeAdresseNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonType)null);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)null);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE:
				unsetAbweichendeAdresse();
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				setAbweichendeAdressePerso((PostalischeInlandsanschriftBasisType)null);
				return;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS:
				getAbweichendeAdresseNachweis().clear();
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
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__NAMEN:
				return namen != null;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return geburtsdaten != null;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ADRESSE:
				return adresse != null;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE:
				return isSetAbweichendeAdresse();
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_PERSO:
				return abweichendeAdressePerso != null;
			case BeistandschaftPackage.ANTRAGSTELLENDER_ELTERNTEIL_BEENDIGUNG_TYPE__ABWEICHENDE_ADRESSE_NACHWEIS:
				return abweichendeAdresseNachweis != null && !abweichendeAdresseNachweis.isEmpty();
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
		result.append(" (abweichendeAdresse: ");
		if (abweichendeAdresseESet) result.append(abweichendeAdresse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AntragstellenderElternteilBeendigungTypeImpl

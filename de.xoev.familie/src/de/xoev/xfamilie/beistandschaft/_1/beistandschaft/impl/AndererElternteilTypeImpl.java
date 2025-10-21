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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.GeburtType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType;

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
 * An implementation of the model object '<em><b>Anderer Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#isAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getNamen <em>Namen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#isAngabenZurAdresse <em>Angaben Zur Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#isAnerkennungVaterschaft <em>Anerkennung Vaterschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AndererElternteilTypeImpl#getWeitereAngabenzumAnderenElternteil <em>Weitere Angabenzum Anderen Elternteil</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndererElternteilTypeImpl extends MinimalEObjectImpl.Container implements AndererElternteilType {
	/**
	 * The default value of the '{@link #isAngabenZumAnderenElternteil() <em>Angaben Zum Anderen Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabenZumAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANGABEN_ZUM_ANDEREN_ELTERNTEIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAngabenZumAnderenElternteil() <em>Angaben Zum Anderen Elternteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabenZumAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected boolean angabenZumAnderenElternteil = ANGABEN_ZUM_ANDEREN_ELTERNTEIL_EDEFAULT;

	/**
	 * This is true if the Angaben Zum Anderen Elternteil attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angabenZumAnderenElternteilESet;

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
	 * The cached value of the '{@link #getFamilienstand() <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected CodeFamilienstandType familienstand;

	/**
	 * The default value of the '{@link #isAngabenZurAdresse() <em>Angaben Zur Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabenZurAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANGABEN_ZUR_ADRESSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAngabenZurAdresse() <em>Angaben Zur Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAngabenZurAdresse()
	 * @generated
	 * @ordered
	 */
	protected boolean angabenZurAdresse = ANGABEN_ZUR_ADRESSE_EDEFAULT;

	/**
	 * This is true if the Angaben Zur Adresse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean angabenZurAdresseESet;

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
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> erreichbarkeit;

	/**
	 * The default value of the '{@link #isAnerkennungVaterschaft() <em>Anerkennung Vaterschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnerkennungVaterschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANERKENNUNG_VATERSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnerkennungVaterschaft() <em>Anerkennung Vaterschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnerkennungVaterschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean anerkennungVaterschaft = ANERKENNUNG_VATERSCHAFT_EDEFAULT;

	/**
	 * This is true if the Anerkennung Vaterschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anerkennungVaterschaftESet;

	/**
	 * The cached value of the '{@link #getWeitereAngabenzumAnderenElternteil() <em>Weitere Angabenzum Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereAngabenzumAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected WeitereAngabenZumAnderenElternteilType weitereAngabenzumAnderenElternteil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndererElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANDERER_ELTERNTEIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAngabenZumAnderenElternteil() {
		return angabenZumAnderenElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabenZumAnderenElternteil(boolean newAngabenZumAnderenElternteil) {
		boolean oldAngabenZumAnderenElternteil = angabenZumAnderenElternteil;
		angabenZumAnderenElternteil = newAngabenZumAnderenElternteil;
		boolean oldAngabenZumAnderenElternteilESet = angabenZumAnderenElternteilESet;
		angabenZumAnderenElternteilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, oldAngabenZumAnderenElternteil, angabenZumAnderenElternteil, !oldAngabenZumAnderenElternteilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAngabenZumAnderenElternteil() {
		boolean oldAngabenZumAnderenElternteil = angabenZumAnderenElternteil;
		boolean oldAngabenZumAnderenElternteilESet = angabenZumAnderenElternteilESet;
		angabenZumAnderenElternteil = ANGABEN_ZUM_ANDEREN_ELTERNTEIL_EDEFAULT;
		angabenZumAnderenElternteilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, oldAngabenZumAnderenElternteil, ANGABEN_ZUM_ANDEREN_ELTERNTEIL_EDEFAULT, oldAngabenZumAnderenElternteilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAngabenZumAnderenElternteil() {
		return angabenZumAnderenElternteilESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN, oldNamen, newNamen);
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
				msgs = ((InternalEObject)namen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN, null, msgs);
			if (newNamen != null)
				msgs = ((InternalEObject)newNamen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN, null, msgs);
			msgs = basicSetNamen(newNamen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN, newNamen, newNamen));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN, oldGeburtsdaten, newGeburtsdaten);
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
				msgs = ((InternalEObject)geburtsdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN, null, msgs);
			if (newGeburtsdaten != null)
				msgs = ((InternalEObject)newGeburtsdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN, null, msgs);
			msgs = basicSetGeburtsdaten(newGeburtsdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN, newGeburtsdaten, newGeburtsdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeFamilienstandType getFamilienstand() {
		return familienstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilienstand(CodeFamilienstandType newFamilienstand, NotificationChain msgs) {
		CodeFamilienstandType oldFamilienstand = familienstand;
		familienstand = newFamilienstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND, oldFamilienstand, newFamilienstand);
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
	public void setFamilienstand(CodeFamilienstandType newFamilienstand) {
		if (newFamilienstand != familienstand) {
			NotificationChain msgs = null;
			if (familienstand != null)
				msgs = ((InternalEObject)familienstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND, null, msgs);
			if (newFamilienstand != null)
				msgs = ((InternalEObject)newFamilienstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND, null, msgs);
			msgs = basicSetFamilienstand(newFamilienstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND, newFamilienstand, newFamilienstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAngabenZurAdresse() {
		return angabenZurAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAngabenZurAdresse(boolean newAngabenZurAdresse) {
		boolean oldAngabenZurAdresse = angabenZurAdresse;
		angabenZurAdresse = newAngabenZurAdresse;
		boolean oldAngabenZurAdresseESet = angabenZurAdresseESet;
		angabenZurAdresseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE, oldAngabenZurAdresse, angabenZurAdresse, !oldAngabenZurAdresseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAngabenZurAdresse() {
		boolean oldAngabenZurAdresse = angabenZurAdresse;
		boolean oldAngabenZurAdresseESet = angabenZurAdresseESet;
		angabenZurAdresse = ANGABEN_ZUR_ADRESSE_EDEFAULT;
		angabenZurAdresseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE, oldAngabenZurAdresse, ANGABEN_ZUR_ADRESSE_EDEFAULT, oldAngabenZurAdresseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAngabenZurAdresse() {
		return angabenZurAdresseESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE, oldAdresse, newAdresse);
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
				msgs = ((InternalEObject)adresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE, null, msgs);
			if (newAdresse != null)
				msgs = ((InternalEObject)newAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE, null, msgs);
			msgs = basicSetAdresse(newAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE, newAdresse, newAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getErreichbarkeit() {
		if (erreichbarkeit == null) {
			erreichbarkeit = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT);
		}
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnerkennungVaterschaft() {
		return anerkennungVaterschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnerkennungVaterschaft(boolean newAnerkennungVaterschaft) {
		boolean oldAnerkennungVaterschaft = anerkennungVaterschaft;
		anerkennungVaterschaft = newAnerkennungVaterschaft;
		boolean oldAnerkennungVaterschaftESet = anerkennungVaterschaftESet;
		anerkennungVaterschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT, oldAnerkennungVaterschaft, anerkennungVaterschaft, !oldAnerkennungVaterschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnerkennungVaterschaft() {
		boolean oldAnerkennungVaterschaft = anerkennungVaterschaft;
		boolean oldAnerkennungVaterschaftESet = anerkennungVaterschaftESet;
		anerkennungVaterschaft = ANERKENNUNG_VATERSCHAFT_EDEFAULT;
		anerkennungVaterschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT, oldAnerkennungVaterschaft, ANERKENNUNG_VATERSCHAFT_EDEFAULT, oldAnerkennungVaterschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnerkennungVaterschaft() {
		return anerkennungVaterschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeitereAngabenZumAnderenElternteilType getWeitereAngabenzumAnderenElternteil() {
		return weitereAngabenzumAnderenElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeitereAngabenzumAnderenElternteil(WeitereAngabenZumAnderenElternteilType newWeitereAngabenzumAnderenElternteil, NotificationChain msgs) {
		WeitereAngabenZumAnderenElternteilType oldWeitereAngabenzumAnderenElternteil = weitereAngabenzumAnderenElternteil;
		weitereAngabenzumAnderenElternteil = newWeitereAngabenzumAnderenElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL, oldWeitereAngabenzumAnderenElternteil, newWeitereAngabenzumAnderenElternteil);
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
	public void setWeitereAngabenzumAnderenElternteil(WeitereAngabenZumAnderenElternteilType newWeitereAngabenzumAnderenElternteil) {
		if (newWeitereAngabenzumAnderenElternteil != weitereAngabenzumAnderenElternteil) {
			NotificationChain msgs = null;
			if (weitereAngabenzumAnderenElternteil != null)
				msgs = ((InternalEObject)weitereAngabenzumAnderenElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL, null, msgs);
			if (newWeitereAngabenzumAnderenElternteil != null)
				msgs = ((InternalEObject)newWeitereAngabenzumAnderenElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL, null, msgs);
			msgs = basicSetWeitereAngabenzumAnderenElternteil(newWeitereAngabenzumAnderenElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL, newWeitereAngabenzumAnderenElternteil, newWeitereAngabenzumAnderenElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN:
				return basicSetNamen(null, msgs);
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN:
				return basicSetGeburtsdaten(null, msgs);
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND:
				return basicSetFamilienstand(null, msgs);
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE:
				return basicSetAdresse(null, msgs);
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT:
				return ((InternalEList<?>)getErreichbarkeit()).basicRemove(otherEnd, msgs);
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL:
				return basicSetWeitereAngabenzumAnderenElternteil(null, msgs);
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				return isAngabenZumAnderenElternteil();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN:
				return getNamen();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN:
				return getGeburtsdaten();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND:
				return getFamilienstand();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE:
				return isAngabenZurAdresse();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE:
				return getAdresse();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT:
				return isAnerkennungVaterschaft();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL:
				return getWeitereAngabenzumAnderenElternteil();
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				setAngabenZumAnderenElternteil((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonType)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND:
				setFamilienstand((CodeFamilienstandType)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE:
				setAngabenZurAdresse((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				getErreichbarkeit().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT:
				setAnerkennungVaterschaft((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL:
				setWeitereAngabenzumAnderenElternteil((WeitereAngabenZumAnderenElternteilType)newValue);
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				unsetAngabenZumAnderenElternteil();
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN:
				setNamen((NameNatuerlichePersonType)null);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)null);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND:
				setFamilienstand((CodeFamilienstandType)null);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE:
				unsetAngabenZurAdresse();
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE:
				setAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT:
				getErreichbarkeit().clear();
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT:
				unsetAnerkennungVaterschaft();
				return;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL:
				setWeitereAngabenzumAnderenElternteil((WeitereAngabenZumAnderenElternteilType)null);
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
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				return isSetAngabenZumAnderenElternteil();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__NAMEN:
				return namen != null;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__GEBURTSDATEN:
				return geburtsdaten != null;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__FAMILIENSTAND:
				return familienstand != null;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANGABEN_ZUR_ADRESSE:
				return isSetAngabenZurAdresse();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ADRESSE:
				return adresse != null;
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null && !erreichbarkeit.isEmpty();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__ANERKENNUNG_VATERSCHAFT:
				return isSetAnerkennungVaterschaft();
			case BeistandschaftPackage.ANDERER_ELTERNTEIL_TYPE__WEITERE_ANGABENZUM_ANDEREN_ELTERNTEIL:
				return weitereAngabenzumAnderenElternteil != null;
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
		result.append(" (angabenZumAnderenElternteil: ");
		if (angabenZumAnderenElternteilESet) result.append(angabenZumAnderenElternteil); else result.append("<unset>");
		result.append(", angabenZurAdresse: ");
		if (angabenZurAdresseESet) result.append(angabenZurAdresse); else result.append("<unset>");
		result.append(", anerkennungVaterschaft: ");
		if (anerkennungVaterschaftESet) result.append(anerkennungVaterschaft); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AndererElternteilTypeImpl

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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType;
import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType;

import de.xoev.xfamilie.geburt._1.geburt.AngabenZumElternteil2Type;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;

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
 * An implementation of the model object '<em><b>Angaben Zum Elternteil2 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getNameElternteil2 <em>Name Elternteil2</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#isDolmetscherBenoetigt <em>Dolmetscher Benoetigt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getAnschriftAusland <em>Anschrift Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getKontakt <em>Kontakt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#isAenderungAnschriftLetzte5Jahre <em>Aenderung Anschrift Letzte5 Jahre</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.AngabenZumElternteil2TypeImpl#getAnschriftPostalisch <em>Anschrift Postalisch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZumElternteil2TypeImpl extends MinimalEObjectImpl.Container implements AngabenZumElternteil2Type {
	/**
	 * The cached value of the '{@link #getNameElternteil2() <em>Name Elternteil2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameElternteil2()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameElternteil2;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtType geburt;

	/**
	 * The default value of the '{@link #isDolmetscherBenoetigt() <em>Dolmetscher Benoetigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDolmetscherBenoetigt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOLMETSCHER_BENOETIGT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDolmetscherBenoetigt() <em>Dolmetscher Benoetigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDolmetscherBenoetigt()
	 * @generated
	 * @ordered
	 */
	protected boolean dolmetscherBenoetigt = DOLMETSCHER_BENOETIGT_EDEFAULT;

	/**
	 * This is true if the Dolmetscher Benoetigt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dolmetscherBenoetigtESet;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected EList<MeldeanschriftType> anschrift;

	/**
	 * The cached value of the '{@link #getAnschriftAusland() <em>Anschrift Ausland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftAusland()
	 * @generated
	 * @ordered
	 */
	protected AuslandsanschriftType anschriftAusland;

	/**
	 * The cached value of the '{@link #getKontakt() <em>Kontakt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontakt()
	 * @generated
	 * @ordered
	 */
	protected EList<ErreichbarkeitType> kontakt;

	/**
	 * The default value of the '{@link #isAenderungAnschriftLetzte5Jahre() <em>Aenderung Anschrift Letzte5 Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAenderungAnschriftLetzte5Jahre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAenderungAnschriftLetzte5Jahre() <em>Aenderung Anschrift Letzte5 Jahre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAenderungAnschriftLetzte5Jahre()
	 * @generated
	 * @ordered
	 */
	protected boolean aenderungAnschriftLetzte5Jahre = AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE_EDEFAULT;

	/**
	 * This is true if the Aenderung Anschrift Letzte5 Jahre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aenderungAnschriftLetzte5JahreESet;

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
	 * The cached value of the '{@link #getAnschriftPostalisch() <em>Anschrift Postalisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftPostalisch()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftType anschriftPostalisch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZumElternteil2TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeburtPackage.Literals.ANGABEN_ZUM_ELTERNTEIL2_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameElternteil2() {
		return nameElternteil2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameElternteil2(NameNatuerlichePersonType newNameElternteil2, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameElternteil2 = nameElternteil2;
		nameElternteil2 = newNameElternteil2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2, oldNameElternteil2, newNameElternteil2);
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
	public void setNameElternteil2(NameNatuerlichePersonType newNameElternteil2) {
		if (newNameElternteil2 != nameElternteil2) {
			NotificationChain msgs = null;
			if (nameElternteil2 != null)
				msgs = ((InternalEObject)nameElternteil2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2, null, msgs);
			if (newNameElternteil2 != null)
				msgs = ((InternalEObject)newNameElternteil2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2, null, msgs);
			msgs = basicSetNameElternteil2(newNameElternteil2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2, newNameElternteil2, newNameElternteil2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtType newGeburt, NotificationChain msgs) {
		GeburtType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDolmetscherBenoetigt() {
		return dolmetscherBenoetigt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDolmetscherBenoetigt(boolean newDolmetscherBenoetigt) {
		boolean oldDolmetscherBenoetigt = dolmetscherBenoetigt;
		dolmetscherBenoetigt = newDolmetscherBenoetigt;
		boolean oldDolmetscherBenoetigtESet = dolmetscherBenoetigtESet;
		dolmetscherBenoetigtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT, oldDolmetscherBenoetigt, dolmetscherBenoetigt, !oldDolmetscherBenoetigtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDolmetscherBenoetigt() {
		boolean oldDolmetscherBenoetigt = dolmetscherBenoetigt;
		boolean oldDolmetscherBenoetigtESet = dolmetscherBenoetigtESet;
		dolmetscherBenoetigt = DOLMETSCHER_BENOETIGT_EDEFAULT;
		dolmetscherBenoetigtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT, oldDolmetscherBenoetigt, DOLMETSCHER_BENOETIGT_EDEFAULT, oldDolmetscherBenoetigtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDolmetscherBenoetigt() {
		return dolmetscherBenoetigtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeldeanschriftType> getAnschrift() {
		if (anschrift == null) {
			anschrift = new EObjectContainmentEList<MeldeanschriftType>(MeldeanschriftType.class, this, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT);
		}
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuslandsanschriftType getAnschriftAusland() {
		return anschriftAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftAusland(AuslandsanschriftType newAnschriftAusland, NotificationChain msgs) {
		AuslandsanschriftType oldAnschriftAusland = anschriftAusland;
		anschriftAusland = newAnschriftAusland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND, oldAnschriftAusland, newAnschriftAusland);
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
	public void setAnschriftAusland(AuslandsanschriftType newAnschriftAusland) {
		if (newAnschriftAusland != anschriftAusland) {
			NotificationChain msgs = null;
			if (anschriftAusland != null)
				msgs = ((InternalEObject)anschriftAusland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			if (newAnschriftAusland != null)
				msgs = ((InternalEObject)newAnschriftAusland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND, null, msgs);
			msgs = basicSetAnschriftAusland(newAnschriftAusland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND, newAnschriftAusland, newAnschriftAusland));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ErreichbarkeitType> getKontakt() {
		if (kontakt == null) {
			kontakt = new EObjectContainmentEList<ErreichbarkeitType>(ErreichbarkeitType.class, this, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT);
		}
		return kontakt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAenderungAnschriftLetzte5Jahre() {
		return aenderungAnschriftLetzte5Jahre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAenderungAnschriftLetzte5Jahre(boolean newAenderungAnschriftLetzte5Jahre) {
		boolean oldAenderungAnschriftLetzte5Jahre = aenderungAnschriftLetzte5Jahre;
		aenderungAnschriftLetzte5Jahre = newAenderungAnschriftLetzte5Jahre;
		boolean oldAenderungAnschriftLetzte5JahreESet = aenderungAnschriftLetzte5JahreESet;
		aenderungAnschriftLetzte5JahreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE, oldAenderungAnschriftLetzte5Jahre, aenderungAnschriftLetzte5Jahre, !oldAenderungAnschriftLetzte5JahreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAenderungAnschriftLetzte5Jahre() {
		boolean oldAenderungAnschriftLetzte5Jahre = aenderungAnschriftLetzte5Jahre;
		boolean oldAenderungAnschriftLetzte5JahreESet = aenderungAnschriftLetzte5JahreESet;
		aenderungAnschriftLetzte5Jahre = AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE_EDEFAULT;
		aenderungAnschriftLetzte5JahreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE, oldAenderungAnschriftLetzte5Jahre, AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE_EDEFAULT, oldAenderungAnschriftLetzte5JahreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAenderungAnschriftLetzte5Jahre() {
		return aenderungAnschriftLetzte5JahreESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND, oldFamilienstand, newFamilienstand);
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
				msgs = ((InternalEObject)familienstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND, null, msgs);
			if (newFamilienstand != null)
				msgs = ((InternalEObject)newFamilienstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND, null, msgs);
			msgs = basicSetFamilienstand(newFamilienstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND, newFamilienstand, newFamilienstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftType getAnschriftPostalisch() {
		return anschriftPostalisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftPostalisch(PostalischeInlandsanschriftType newAnschriftPostalisch, NotificationChain msgs) {
		PostalischeInlandsanschriftType oldAnschriftPostalisch = anschriftPostalisch;
		anschriftPostalisch = newAnschriftPostalisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH, oldAnschriftPostalisch, newAnschriftPostalisch);
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
	public void setAnschriftPostalisch(PostalischeInlandsanschriftType newAnschriftPostalisch) {
		if (newAnschriftPostalisch != anschriftPostalisch) {
			NotificationChain msgs = null;
			if (anschriftPostalisch != null)
				msgs = ((InternalEObject)anschriftPostalisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH, null, msgs);
			if (newAnschriftPostalisch != null)
				msgs = ((InternalEObject)newAnschriftPostalisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH, null, msgs);
			msgs = basicSetAnschriftPostalisch(newAnschriftPostalisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH, newAnschriftPostalisch, newAnschriftPostalisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2:
				return basicSetNameElternteil2(null, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT:
				return ((InternalEList<?>)getAnschrift()).basicRemove(otherEnd, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND:
				return basicSetAnschriftAusland(null, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT:
				return ((InternalEList<?>)getKontakt()).basicRemove(otherEnd, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND:
				return basicSetFamilienstand(null, msgs);
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH:
				return basicSetAnschriftPostalisch(null, msgs);
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
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2:
				return getNameElternteil2();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT:
				return getGeburt();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT:
				return isDolmetscherBenoetigt();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT:
				return getAnschrift();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND:
				return getAnschriftAusland();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT:
				return getKontakt();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE:
				return isAenderungAnschriftLetzte5Jahre();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND:
				return getFamilienstand();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH:
				return getAnschriftPostalisch();
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
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2:
				setNameElternteil2((NameNatuerlichePersonType)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT:
				setGeburt((GeburtType)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT:
				setDolmetscherBenoetigt((Boolean)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT:
				getAnschrift().clear();
				getAnschrift().addAll((Collection<? extends MeldeanschriftType>)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT:
				getKontakt().clear();
				getKontakt().addAll((Collection<? extends ErreichbarkeitType>)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE:
				setAenderungAnschriftLetzte5Jahre((Boolean)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND:
				setFamilienstand((CodeFamilienstandType)newValue);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH:
				setAnschriftPostalisch((PostalischeInlandsanschriftType)newValue);
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
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2:
				setNameElternteil2((NameNatuerlichePersonType)null);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT:
				setGeburt((GeburtType)null);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT:
				unsetDolmetscherBenoetigt();
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT:
				getAnschrift().clear();
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND:
				setAnschriftAusland((AuslandsanschriftType)null);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT:
				getKontakt().clear();
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE:
				unsetAenderungAnschriftLetzte5Jahre();
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND:
				setFamilienstand((CodeFamilienstandType)null);
				return;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH:
				setAnschriftPostalisch((PostalischeInlandsanschriftType)null);
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
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__NAME_ELTERNTEIL2:
				return nameElternteil2 != null;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__GEBURT:
				return geburt != null;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__DOLMETSCHER_BENOETIGT:
				return isSetDolmetscherBenoetigt();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT:
				return anschrift != null && !anschrift.isEmpty();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_AUSLAND:
				return anschriftAusland != null;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__KONTAKT:
				return kontakt != null && !kontakt.isEmpty();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__AENDERUNG_ANSCHRIFT_LETZTE5_JAHRE:
				return isSetAenderungAnschriftLetzte5Jahre();
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__FAMILIENSTAND:
				return familienstand != null;
			case GeburtPackage.ANGABEN_ZUM_ELTERNTEIL2_TYPE__ANSCHRIFT_POSTALISCH:
				return anschriftPostalisch != null;
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
		result.append(" (dolmetscherBenoetigt: ");
		if (dolmetscherBenoetigtESet) result.append(dolmetscherBenoetigt); else result.append("<unset>");
		result.append(", aenderungAnschriftLetzte5Jahre: ");
		if (aenderungAnschriftLetzte5JahreESet) result.append(aenderungAnschriftLetzte5Jahre); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenZumElternteil2TypeImpl

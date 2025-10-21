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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AusbildungUndEinkuenfteType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zum Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#isKindBereitsGeboren <em>Kind Bereits Geboren</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getVoraussichtlicherEntbindungstermin <em>Voraussichtlicher Entbindungstermin</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getGeburtenregisternummer <em>Geburtenregisternummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getKindWohnhaftBei <em>Kind Wohnhaft Bei</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getKindLebtBeiSonstige <em>Kind Lebt Bei Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getAusbildungUndEinkuenfte <em>Ausbildung Und Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindTypeImpl#getWeitereKinder <em>Weitere Kinder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZumKindTypeImpl extends MinimalEObjectImpl.Container implements AngabenZumKindType {
	/**
	 * The default value of the '{@link #isKindBereitsGeboren() <em>Kind Bereits Geboren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindBereitsGeboren()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KIND_BEREITS_GEBOREN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKindBereitsGeboren() <em>Kind Bereits Geboren</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKindBereitsGeboren()
	 * @generated
	 * @ordered
	 */
	protected boolean kindBereitsGeboren = KIND_BEREITS_GEBOREN_EDEFAULT;

	/**
	 * This is true if the Kind Bereits Geboren attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kindBereitsGeborenESet;

	/**
	 * The default value of the '{@link #getVoraussichtlicherEntbindungstermin() <em>Voraussichtlicher Entbindungstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicherEntbindungstermin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar VORAUSSICHTLICHER_ENTBINDUNGSTERMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicherEntbindungstermin() <em>Voraussichtlicher Entbindungstermin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicherEntbindungstermin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar voraussichtlicherEntbindungstermin = VORAUSSICHTLICHER_ENTBINDUNGSTERMIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameDesKindes() <em>Name Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDesKindes()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonOhneGeburtsnameType nameDesKindes;

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
	 * The default value of the '{@link #getGeburtenregisternummer() <em>Geburtenregisternummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtenregisternummer()
	 * @generated
	 * @ordered
	 */
	protected static final String GEBURTENREGISTERNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeburtenregisternummer() <em>Geburtenregisternummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtenregisternummer()
	 * @generated
	 * @ordered
	 */
	protected String geburtenregisternummer = GEBURTENREGISTERNUMMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKindWohnhaftBei() <em>Kind Wohnhaft Bei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindWohnhaftBei()
	 * @generated
	 * @ordered
	 */
	protected CodeKindWohnhaftBeiType kindWohnhaftBei;

	/**
	 * The default value of the '{@link #getKindLebtBeiSonstige() <em>Kind Lebt Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindLebtBeiSonstige()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_LEBT_BEI_SONSTIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindLebtBeiSonstige() <em>Kind Lebt Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindLebtBeiSonstige()
	 * @generated
	 * @ordered
	 */
	protected String kindLebtBeiSonstige = KIND_LEBT_BEI_SONSTIGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAusbildungUndEinkuenfte() <em>Ausbildung Und Einkuenfte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAusbildungUndEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected AusbildungUndEinkuenfteType ausbildungUndEinkuenfte;

	/**
	 * The cached value of the '{@link #getWeitereKinderImHaushalt() <em>Weitere Kinder Im Haushalt</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereKinderImHaushalt()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> weitereKinderImHaushalt;

	/**
	 * The cached value of the '{@link #getWeitereKinder() <em>Weitere Kinder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeitereKinder()
	 * @generated
	 * @ordered
	 */
	protected EList<WeitereKinderType> weitereKinder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZumKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANGABEN_ZUM_KIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKindBereitsGeboren() {
		return kindBereitsGeboren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindBereitsGeboren(boolean newKindBereitsGeboren) {
		boolean oldKindBereitsGeboren = kindBereitsGeboren;
		kindBereitsGeboren = newKindBereitsGeboren;
		boolean oldKindBereitsGeborenESet = kindBereitsGeborenESet;
		kindBereitsGeborenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN, oldKindBereitsGeboren, kindBereitsGeboren, !oldKindBereitsGeborenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKindBereitsGeboren() {
		boolean oldKindBereitsGeboren = kindBereitsGeboren;
		boolean oldKindBereitsGeborenESet = kindBereitsGeborenESet;
		kindBereitsGeboren = KIND_BEREITS_GEBOREN_EDEFAULT;
		kindBereitsGeborenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN, oldKindBereitsGeboren, KIND_BEREITS_GEBOREN_EDEFAULT, oldKindBereitsGeborenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKindBereitsGeboren() {
		return kindBereitsGeborenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getVoraussichtlicherEntbindungstermin() {
		return voraussichtlicherEntbindungstermin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicherEntbindungstermin(XMLGregorianCalendar newVoraussichtlicherEntbindungstermin) {
		XMLGregorianCalendar oldVoraussichtlicherEntbindungstermin = voraussichtlicherEntbindungstermin;
		voraussichtlicherEntbindungstermin = newVoraussichtlicherEntbindungstermin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN, oldVoraussichtlicherEntbindungstermin, voraussichtlicherEntbindungstermin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonOhneGeburtsnameType getNameDesKindes() {
		return nameDesKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameDesKindes(NameNatuerlichePersonOhneGeburtsnameType newNameDesKindes, NotificationChain msgs) {
		NameNatuerlichePersonOhneGeburtsnameType oldNameDesKindes = nameDesKindes;
		nameDesKindes = newNameDesKindes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES, oldNameDesKindes, newNameDesKindes);
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
	public void setNameDesKindes(NameNatuerlichePersonOhneGeburtsnameType newNameDesKindes) {
		if (newNameDesKindes != nameDesKindes) {
			NotificationChain msgs = null;
			if (nameDesKindes != null)
				msgs = ((InternalEObject)nameDesKindes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES, null, msgs);
			if (newNameDesKindes != null)
				msgs = ((InternalEObject)newNameDesKindes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES, null, msgs);
			msgs = basicSetNameDesKindes(newNameDesKindes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES, newNameDesKindes, newNameDesKindes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN, oldGeburtsdaten, newGeburtsdaten);
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
				msgs = ((InternalEObject)geburtsdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN, null, msgs);
			if (newGeburtsdaten != null)
				msgs = ((InternalEObject)newGeburtsdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN, null, msgs);
			msgs = basicSetGeburtsdaten(newGeburtsdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN, newGeburtsdaten, newGeburtsdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeburtenregisternummer() {
		return geburtenregisternummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeburtenregisternummer(String newGeburtenregisternummer) {
		String oldGeburtenregisternummer = geburtenregisternummer;
		geburtenregisternummer = newGeburtenregisternummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER, oldGeburtenregisternummer, geburtenregisternummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindWohnhaftBeiType getKindWohnhaftBei() {
		return kindWohnhaftBei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindWohnhaftBei(CodeKindWohnhaftBeiType newKindWohnhaftBei, NotificationChain msgs) {
		CodeKindWohnhaftBeiType oldKindWohnhaftBei = kindWohnhaftBei;
		kindWohnhaftBei = newKindWohnhaftBei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI, oldKindWohnhaftBei, newKindWohnhaftBei);
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
	public void setKindWohnhaftBei(CodeKindWohnhaftBeiType newKindWohnhaftBei) {
		if (newKindWohnhaftBei != kindWohnhaftBei) {
			NotificationChain msgs = null;
			if (kindWohnhaftBei != null)
				msgs = ((InternalEObject)kindWohnhaftBei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI, null, msgs);
			if (newKindWohnhaftBei != null)
				msgs = ((InternalEObject)newKindWohnhaftBei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI, null, msgs);
			msgs = basicSetKindWohnhaftBei(newKindWohnhaftBei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI, newKindWohnhaftBei, newKindWohnhaftBei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKindLebtBeiSonstige() {
		return kindLebtBeiSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKindLebtBeiSonstige(String newKindLebtBeiSonstige) {
		String oldKindLebtBeiSonstige = kindLebtBeiSonstige;
		kindLebtBeiSonstige = newKindLebtBeiSonstige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE, oldKindLebtBeiSonstige, kindLebtBeiSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AusbildungUndEinkuenfteType getAusbildungUndEinkuenfte() {
		return ausbildungUndEinkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAusbildungUndEinkuenfte(AusbildungUndEinkuenfteType newAusbildungUndEinkuenfte, NotificationChain msgs) {
		AusbildungUndEinkuenfteType oldAusbildungUndEinkuenfte = ausbildungUndEinkuenfte;
		ausbildungUndEinkuenfte = newAusbildungUndEinkuenfte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE, oldAusbildungUndEinkuenfte, newAusbildungUndEinkuenfte);
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
	public void setAusbildungUndEinkuenfte(AusbildungUndEinkuenfteType newAusbildungUndEinkuenfte) {
		if (newAusbildungUndEinkuenfte != ausbildungUndEinkuenfte) {
			NotificationChain msgs = null;
			if (ausbildungUndEinkuenfte != null)
				msgs = ((InternalEObject)ausbildungUndEinkuenfte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE, null, msgs);
			if (newAusbildungUndEinkuenfte != null)
				msgs = ((InternalEObject)newAusbildungUndEinkuenfte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE, null, msgs);
			msgs = basicSetAusbildungUndEinkuenfte(newAusbildungUndEinkuenfte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE, newAusbildungUndEinkuenfte, newAusbildungUndEinkuenfte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Boolean> getWeitereKinderImHaushalt() {
		if (weitereKinderImHaushalt == null) {
			weitereKinderImHaushalt = new EDataTypeEList<Boolean>(Boolean.class, this, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT);
		}
		return weitereKinderImHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeitereKinderType> getWeitereKinder() {
		if (weitereKinder == null) {
			weitereKinder = new EObjectContainmentEList<WeitereKinderType>(WeitereKinderType.class, this, BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER);
		}
		return weitereKinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return basicSetNameDesKindes(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN:
				return basicSetGeburtsdaten(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI:
				return basicSetKindWohnhaftBei(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE:
				return basicSetAusbildungUndEinkuenfte(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER:
				return ((InternalEList<?>)getWeitereKinder()).basicRemove(otherEnd, msgs);
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN:
				return isKindBereitsGeboren();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN:
				return getVoraussichtlicherEntbindungstermin();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return getNameDesKindes();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN:
				return getGeburtsdaten();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER:
				return getGeburtenregisternummer();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI:
				return getKindWohnhaftBei();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE:
				return getKindLebtBeiSonstige();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE:
				return getAusbildungUndEinkuenfte();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return getWeitereKinderImHaushalt();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER:
				return getWeitereKinder();
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN:
				setKindBereitsGeboren((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN:
				setVoraussichtlicherEntbindungstermin((XMLGregorianCalendar)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				setNameDesKindes((NameNatuerlichePersonOhneGeburtsnameType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER:
				setGeburtenregisternummer((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI:
				setKindWohnhaftBei((CodeKindWohnhaftBeiType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE:
				setKindLebtBeiSonstige((String)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE:
				setAusbildungUndEinkuenfte((AusbildungUndEinkuenfteType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				getWeitereKinderImHaushalt().clear();
				getWeitereKinderImHaushalt().addAll((Collection<? extends Boolean>)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER:
				getWeitereKinder().clear();
				getWeitereKinder().addAll((Collection<? extends WeitereKinderType>)newValue);
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN:
				unsetKindBereitsGeboren();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN:
				setVoraussichtlicherEntbindungstermin(VORAUSSICHTLICHER_ENTBINDUNGSTERMIN_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				setNameDesKindes((NameNatuerlichePersonOhneGeburtsnameType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER:
				setGeburtenregisternummer(GEBURTENREGISTERNUMMER_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI:
				setKindWohnhaftBei((CodeKindWohnhaftBeiType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE:
				setKindLebtBeiSonstige(KIND_LEBT_BEI_SONSTIGE_EDEFAULT);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE:
				setAusbildungUndEinkuenfte((AusbildungUndEinkuenfteType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				getWeitereKinderImHaushalt().clear();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER:
				getWeitereKinder().clear();
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_BEREITS_GEBOREN:
				return isSetKindBereitsGeboren();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__VORAUSSICHTLICHER_ENTBINDUNGSTERMIN:
				return VORAUSSICHTLICHER_ENTBINDUNGSTERMIN_EDEFAULT == null ? voraussichtlicherEntbindungstermin != null : !VORAUSSICHTLICHER_ENTBINDUNGSTERMIN_EDEFAULT.equals(voraussichtlicherEntbindungstermin);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__NAME_DES_KINDES:
				return nameDesKindes != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTSDATEN:
				return geburtsdaten != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__GEBURTENREGISTERNUMMER:
				return GEBURTENREGISTERNUMMER_EDEFAULT == null ? geburtenregisternummer != null : !GEBURTENREGISTERNUMMER_EDEFAULT.equals(geburtenregisternummer);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_WOHNHAFT_BEI:
				return kindWohnhaftBei != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__KIND_LEBT_BEI_SONSTIGE:
				return KIND_LEBT_BEI_SONSTIGE_EDEFAULT == null ? kindLebtBeiSonstige != null : !KIND_LEBT_BEI_SONSTIGE_EDEFAULT.equals(kindLebtBeiSonstige);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__AUSBILDUNG_UND_EINKUENFTE:
				return ausbildungUndEinkuenfte != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER_IM_HAUSHALT:
				return weitereKinderImHaushalt != null && !weitereKinderImHaushalt.isEmpty();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_TYPE__WEITERE_KINDER:
				return weitereKinder != null && !weitereKinder.isEmpty();
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
		result.append(" (kindBereitsGeboren: ");
		if (kindBereitsGeborenESet) result.append(kindBereitsGeboren); else result.append("<unset>");
		result.append(", voraussichtlicherEntbindungstermin: ");
		result.append(voraussichtlicherEntbindungstermin);
		result.append(", geburtenregisternummer: ");
		result.append(geburtenregisternummer);
		result.append(", kindLebtBeiSonstige: ");
		result.append(kindLebtBeiSonstige);
		result.append(", weitereKinderImHaushalt: ");
		result.append(weitereKinderImHaushalt);
		result.append(')');
		return result.toString();
	}

} //AngabenZumKindTypeImpl

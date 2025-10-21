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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragdetails Alterssicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#getBeantragungZuschussAlterssicherung <em>Beantragung Zuschuss Alterssicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#getZuschuesse <em>Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#getVonAndererStelle <em>Von Anderer Stelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsAlterssicherungTypeImpl#isHauptpflegeperson <em>Hauptpflegeperson</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragdetailsAlterssicherungTypeImpl extends MinimalEObjectImpl.Container implements AntragdetailsAlterssicherungType {
	/**
	 * The default value of the '{@link #getBeantragungZuschussAlterssicherung() <em>Beantragung Zuschuss Alterssicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungZuschussAlterssicherung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeantragungZuschussAlterssicherung() <em>Beantragung Zuschuss Alterssicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungZuschussAlterssicherung()
	 * @generated
	 * @ordered
	 */
	protected String beantragungZuschussAlterssicherung = BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZuschuesse() <em>Zuschuesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected CodeZuschuesseType zuschuesse;

	/**
	 * The default value of the '{@link #getHoeheZuschuesse() <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected static final float HOEHE_ZUSCHUESSE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoeheZuschuesse() <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected float hoeheZuschuesse = HOEHE_ZUSCHUESSE_EDEFAULT;

	/**
	 * This is true if the Hoehe Zuschuesse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoeheZuschuesseESet;

	/**
	 * The default value of the '{@link #getVonAndererStelle() <em>Von Anderer Stelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVonAndererStelle()
	 * @generated
	 * @ordered
	 */
	protected static final String VON_ANDERER_STELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVonAndererStelle() <em>Von Anderer Stelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVonAndererStelle()
	 * @generated
	 * @ordered
	 */
	protected String vonAndererStelle = VON_ANDERER_STELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isArtHoeheAbsicherung() <em>Art Hoehe Absicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtHoeheAbsicherung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ART_HOEHE_ABSICHERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArtHoeheAbsicherung() <em>Art Hoehe Absicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArtHoeheAbsicherung()
	 * @generated
	 * @ordered
	 */
	protected boolean artHoeheAbsicherung = ART_HOEHE_ABSICHERUNG_EDEFAULT;

	/**
	 * This is true if the Art Hoehe Absicherung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean artHoeheAbsicherungESet;

	/**
	 * The default value of the '{@link #isAlleinigePflegeperson() <em>Alleinige Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlleinigePflegeperson()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLEINIGE_PFLEGEPERSON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlleinigePflegeperson() <em>Alleinige Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlleinigePflegeperson()
	 * @generated
	 * @ordered
	 */
	protected boolean alleinigePflegeperson = ALLEINIGE_PFLEGEPERSON_EDEFAULT;

	/**
	 * This is true if the Alleinige Pflegeperson attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alleinigePflegepersonESet;

	/**
	 * The default value of the '{@link #isHauptpflegeperson() <em>Hauptpflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHauptpflegeperson()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAUPTPFLEGEPERSON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHauptpflegeperson() <em>Hauptpflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHauptpflegeperson()
	 * @generated
	 * @ordered
	 */
	protected boolean hauptpflegeperson = HAUPTPFLEGEPERSON_EDEFAULT;

	/**
	 * This is true if the Hauptpflegeperson attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hauptpflegepersonESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragdetailsAlterssicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeantragungZuschussAlterssicherung() {
		return beantragungZuschussAlterssicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeantragungZuschussAlterssicherung(String newBeantragungZuschussAlterssicherung) {
		String oldBeantragungZuschussAlterssicherung = beantragungZuschussAlterssicherung;
		beantragungZuschussAlterssicherung = newBeantragungZuschussAlterssicherung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG, oldBeantragungZuschussAlterssicherung, beantragungZuschussAlterssicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeZuschuesseType getZuschuesse() {
		return zuschuesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZuschuesse(CodeZuschuesseType newZuschuesse, NotificationChain msgs) {
		CodeZuschuesseType oldZuschuesse = zuschuesse;
		zuschuesse = newZuschuesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE, oldZuschuesse, newZuschuesse);
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
	public void setZuschuesse(CodeZuschuesseType newZuschuesse) {
		if (newZuschuesse != zuschuesse) {
			NotificationChain msgs = null;
			if (zuschuesse != null)
				msgs = ((InternalEObject)zuschuesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE, null, msgs);
			if (newZuschuesse != null)
				msgs = ((InternalEObject)newZuschuesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE, null, msgs);
			msgs = basicSetZuschuesse(newZuschuesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE, newZuschuesse, newZuschuesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHoeheZuschuesse() {
		return hoeheZuschuesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheZuschuesse(float newHoeheZuschuesse) {
		float oldHoeheZuschuesse = hoeheZuschuesse;
		hoeheZuschuesse = newHoeheZuschuesse;
		boolean oldHoeheZuschuesseESet = hoeheZuschuesseESet;
		hoeheZuschuesseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE, oldHoeheZuschuesse, hoeheZuschuesse, !oldHoeheZuschuesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHoeheZuschuesse() {
		float oldHoeheZuschuesse = hoeheZuschuesse;
		boolean oldHoeheZuschuesseESet = hoeheZuschuesseESet;
		hoeheZuschuesse = HOEHE_ZUSCHUESSE_EDEFAULT;
		hoeheZuschuesseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE, oldHoeheZuschuesse, HOEHE_ZUSCHUESSE_EDEFAULT, oldHoeheZuschuesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHoeheZuschuesse() {
		return hoeheZuschuesseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVonAndererStelle() {
		return vonAndererStelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVonAndererStelle(String newVonAndererStelle) {
		String oldVonAndererStelle = vonAndererStelle;
		vonAndererStelle = newVonAndererStelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE, oldVonAndererStelle, vonAndererStelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArtHoeheAbsicherung() {
		return artHoeheAbsicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtHoeheAbsicherung(boolean newArtHoeheAbsicherung) {
		boolean oldArtHoeheAbsicherung = artHoeheAbsicherung;
		artHoeheAbsicherung = newArtHoeheAbsicherung;
		boolean oldArtHoeheAbsicherungESet = artHoeheAbsicherungESet;
		artHoeheAbsicherungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG, oldArtHoeheAbsicherung, artHoeheAbsicherung, !oldArtHoeheAbsicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArtHoeheAbsicherung() {
		boolean oldArtHoeheAbsicherung = artHoeheAbsicherung;
		boolean oldArtHoeheAbsicherungESet = artHoeheAbsicherungESet;
		artHoeheAbsicherung = ART_HOEHE_ABSICHERUNG_EDEFAULT;
		artHoeheAbsicherungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG, oldArtHoeheAbsicherung, ART_HOEHE_ABSICHERUNG_EDEFAULT, oldArtHoeheAbsicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArtHoeheAbsicherung() {
		return artHoeheAbsicherungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAlleinigePflegeperson() {
		return alleinigePflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlleinigePflegeperson(boolean newAlleinigePflegeperson) {
		boolean oldAlleinigePflegeperson = alleinigePflegeperson;
		alleinigePflegeperson = newAlleinigePflegeperson;
		boolean oldAlleinigePflegepersonESet = alleinigePflegepersonESet;
		alleinigePflegepersonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON, oldAlleinigePflegeperson, alleinigePflegeperson, !oldAlleinigePflegepersonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAlleinigePflegeperson() {
		boolean oldAlleinigePflegeperson = alleinigePflegeperson;
		boolean oldAlleinigePflegepersonESet = alleinigePflegepersonESet;
		alleinigePflegeperson = ALLEINIGE_PFLEGEPERSON_EDEFAULT;
		alleinigePflegepersonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON, oldAlleinigePflegeperson, ALLEINIGE_PFLEGEPERSON_EDEFAULT, oldAlleinigePflegepersonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAlleinigePflegeperson() {
		return alleinigePflegepersonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHauptpflegeperson() {
		return hauptpflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHauptpflegeperson(boolean newHauptpflegeperson) {
		boolean oldHauptpflegeperson = hauptpflegeperson;
		hauptpflegeperson = newHauptpflegeperson;
		boolean oldHauptpflegepersonESet = hauptpflegepersonESet;
		hauptpflegepersonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON, oldHauptpflegeperson, hauptpflegeperson, !oldHauptpflegepersonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHauptpflegeperson() {
		boolean oldHauptpflegeperson = hauptpflegeperson;
		boolean oldHauptpflegepersonESet = hauptpflegepersonESet;
		hauptpflegeperson = HAUPTPFLEGEPERSON_EDEFAULT;
		hauptpflegepersonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON, oldHauptpflegeperson, HAUPTPFLEGEPERSON_EDEFAULT, oldHauptpflegepersonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHauptpflegeperson() {
		return hauptpflegepersonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE:
				return basicSetZuschuesse(null, msgs);
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
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG:
				return getBeantragungZuschussAlterssicherung();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE:
				return getZuschuesse();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				return getHoeheZuschuesse();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE:
				return getVonAndererStelle();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG:
				return isArtHoeheAbsicherung();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON:
				return isAlleinigePflegeperson();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON:
				return isHauptpflegeperson();
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
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG:
				setBeantragungZuschussAlterssicherung((String)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE:
				setZuschuesse((CodeZuschuesseType)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				setHoeheZuschuesse((Float)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE:
				setVonAndererStelle((String)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG:
				setArtHoeheAbsicherung((Boolean)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON:
				setAlleinigePflegeperson((Boolean)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON:
				setHauptpflegeperson((Boolean)newValue);
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
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG:
				setBeantragungZuschussAlterssicherung(BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG_EDEFAULT);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE:
				setZuschuesse((CodeZuschuesseType)null);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				unsetHoeheZuschuesse();
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE:
				setVonAndererStelle(VON_ANDERER_STELLE_EDEFAULT);
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG:
				unsetArtHoeheAbsicherung();
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON:
				unsetAlleinigePflegeperson();
				return;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON:
				unsetHauptpflegeperson();
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
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG:
				return BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG_EDEFAULT == null ? beantragungZuschussAlterssicherung != null : !BEANTRAGUNG_ZUSCHUSS_ALTERSSICHERUNG_EDEFAULT.equals(beantragungZuschussAlterssicherung);
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ZUSCHUESSE:
				return zuschuesse != null;
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				return isSetHoeheZuschuesse();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__VON_ANDERER_STELLE:
				return VON_ANDERER_STELLE_EDEFAULT == null ? vonAndererStelle != null : !VON_ANDERER_STELLE_EDEFAULT.equals(vonAndererStelle);
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ART_HOEHE_ABSICHERUNG:
				return isSetArtHoeheAbsicherung();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__ALLEINIGE_PFLEGEPERSON:
				return isSetAlleinigePflegeperson();
			case AdoptionPackage.ANTRAGDETAILS_ALTERSSICHERUNG_TYPE__HAUPTPFLEGEPERSON:
				return isSetHauptpflegeperson();
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
		result.append(" (beantragungZuschussAlterssicherung: ");
		result.append(beantragungZuschussAlterssicherung);
		result.append(", hoeheZuschuesse: ");
		if (hoeheZuschuesseESet) result.append(hoeheZuschuesse); else result.append("<unset>");
		result.append(", vonAndererStelle: ");
		result.append(vonAndererStelle);
		result.append(", artHoeheAbsicherung: ");
		if (artHoeheAbsicherungESet) result.append(artHoeheAbsicherung); else result.append("<unset>");
		result.append(", alleinigePflegeperson: ");
		if (alleinigePflegepersonESet) result.append(alleinigePflegeperson); else result.append("<unset>");
		result.append(", hauptpflegeperson: ");
		if (hauptpflegepersonESet) result.append(hauptpflegeperson); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AntragdetailsAlterssicherungTypeImpl

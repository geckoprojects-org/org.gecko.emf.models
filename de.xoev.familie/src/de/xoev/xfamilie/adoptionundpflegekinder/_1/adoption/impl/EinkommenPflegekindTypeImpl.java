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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einkommen Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getEinkommenAb <em>Einkommen Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getHoeheEinkommen <em>Hoehe Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getBezugKindergeldAb <em>Bezug Kindergeld Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getHoeheKindergeld <em>Hoehe Kindergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getArtDesEinkommens <em>Art Des Einkommens</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getSonstigesEinkommen <em>Sonstiges Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.EinkommenPflegekindTypeImpl#getZustaendigeFamilienkasse <em>Zustaendige Familienkasse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkommenPflegekindTypeImpl extends MinimalEObjectImpl.Container implements EinkommenPflegekindType {
	/**
	 * The default value of the '{@link #getEinkommenAb() <em>Einkommen Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenAb()
	 * @generated
	 * @ordered
	 */
	protected static final String EINKOMMEN_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinkommenAb() <em>Einkommen Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenAb()
	 * @generated
	 * @ordered
	 */
	protected String einkommenAb = EINKOMMEN_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoeheEinkommen() <em>Hoehe Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheEinkommen()
	 * @generated
	 * @ordered
	 */
	protected static final float HOEHE_EINKOMMEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoeheEinkommen() <em>Hoehe Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheEinkommen()
	 * @generated
	 * @ordered
	 */
	protected float hoeheEinkommen = HOEHE_EINKOMMEN_EDEFAULT;

	/**
	 * This is true if the Hoehe Einkommen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoeheEinkommenESet;

	/**
	 * The default value of the '{@link #getBezugKindergeldAb() <em>Bezug Kindergeld Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugKindergeldAb()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEZUG_KINDERGELD_AB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBezugKindergeldAb() <em>Bezug Kindergeld Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezugKindergeldAb()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar bezugKindergeldAb = BEZUG_KINDERGELD_AB_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoeheKindergeld() <em>Hoehe Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheKindergeld()
	 * @generated
	 * @ordered
	 */
	protected static final float HOEHE_KINDERGELD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoeheKindergeld() <em>Hoehe Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheKindergeld()
	 * @generated
	 * @ordered
	 */
	protected float hoeheKindergeld = HOEHE_KINDERGELD_EDEFAULT;

	/**
	 * This is true if the Hoehe Kindergeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoeheKindergeldESet;

	/**
	 * The cached value of the '{@link #getArtDesEinkommens() <em>Art Des Einkommens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtDesEinkommens()
	 * @generated
	 * @ordered
	 */
	protected CodeEinkommensartenType artDesEinkommens;

	/**
	 * The default value of the '{@link #getSonstigesEinkommen() <em>Sonstiges Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigesEinkommen()
	 * @generated
	 * @ordered
	 */
	protected static final String SONSTIGES_EINKOMMEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSonstigesEinkommen() <em>Sonstiges Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigesEinkommen()
	 * @generated
	 * @ordered
	 */
	protected String sonstigesEinkommen = SONSTIGES_EINKOMMEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getZustaendigeFamilienkasse() <em>Zustaendige Familienkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustaendigeFamilienkasse()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSTAENDIGE_FAMILIENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZustaendigeFamilienkasse() <em>Zustaendige Familienkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZustaendigeFamilienkasse()
	 * @generated
	 * @ordered
	 */
	protected String zustaendigeFamilienkasse = ZUSTAENDIGE_FAMILIENKASSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkommenPflegekindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.EINKOMMEN_PFLEGEKIND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEinkommenAb() {
		return einkommenAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkommenAb(String newEinkommenAb) {
		String oldEinkommenAb = einkommenAb;
		einkommenAb = newEinkommenAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB, oldEinkommenAb, einkommenAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHoeheEinkommen() {
		return hoeheEinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheEinkommen(float newHoeheEinkommen) {
		float oldHoeheEinkommen = hoeheEinkommen;
		hoeheEinkommen = newHoeheEinkommen;
		boolean oldHoeheEinkommenESet = hoeheEinkommenESet;
		hoeheEinkommenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN, oldHoeheEinkommen, hoeheEinkommen, !oldHoeheEinkommenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHoeheEinkommen() {
		float oldHoeheEinkommen = hoeheEinkommen;
		boolean oldHoeheEinkommenESet = hoeheEinkommenESet;
		hoeheEinkommen = HOEHE_EINKOMMEN_EDEFAULT;
		hoeheEinkommenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN, oldHoeheEinkommen, HOEHE_EINKOMMEN_EDEFAULT, oldHoeheEinkommenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHoeheEinkommen() {
		return hoeheEinkommenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBezugKindergeldAb() {
		return bezugKindergeldAb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugKindergeldAb(XMLGregorianCalendar newBezugKindergeldAb) {
		XMLGregorianCalendar oldBezugKindergeldAb = bezugKindergeldAb;
		bezugKindergeldAb = newBezugKindergeldAb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB, oldBezugKindergeldAb, bezugKindergeldAb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHoeheKindergeld() {
		return hoeheKindergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheKindergeld(float newHoeheKindergeld) {
		float oldHoeheKindergeld = hoeheKindergeld;
		hoeheKindergeld = newHoeheKindergeld;
		boolean oldHoeheKindergeldESet = hoeheKindergeldESet;
		hoeheKindergeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD, oldHoeheKindergeld, hoeheKindergeld, !oldHoeheKindergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHoeheKindergeld() {
		float oldHoeheKindergeld = hoeheKindergeld;
		boolean oldHoeheKindergeldESet = hoeheKindergeldESet;
		hoeheKindergeld = HOEHE_KINDERGELD_EDEFAULT;
		hoeheKindergeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD, oldHoeheKindergeld, HOEHE_KINDERGELD_EDEFAULT, oldHoeheKindergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHoeheKindergeld() {
		return hoeheKindergeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkommensartenType getArtDesEinkommens() {
		return artDesEinkommens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtDesEinkommens(CodeEinkommensartenType newArtDesEinkommens, NotificationChain msgs) {
		CodeEinkommensartenType oldArtDesEinkommens = artDesEinkommens;
		artDesEinkommens = newArtDesEinkommens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS, oldArtDesEinkommens, newArtDesEinkommens);
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
	public void setArtDesEinkommens(CodeEinkommensartenType newArtDesEinkommens) {
		if (newArtDesEinkommens != artDesEinkommens) {
			NotificationChain msgs = null;
			if (artDesEinkommens != null)
				msgs = ((InternalEObject)artDesEinkommens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS, null, msgs);
			if (newArtDesEinkommens != null)
				msgs = ((InternalEObject)newArtDesEinkommens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS, null, msgs);
			msgs = basicSetArtDesEinkommens(newArtDesEinkommens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS, newArtDesEinkommens, newArtDesEinkommens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSonstigesEinkommen() {
		return sonstigesEinkommen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSonstigesEinkommen(String newSonstigesEinkommen) {
		String oldSonstigesEinkommen = sonstigesEinkommen;
		sonstigesEinkommen = newSonstigesEinkommen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN, oldSonstigesEinkommen, sonstigesEinkommen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZustaendigeFamilienkasse() {
		return zustaendigeFamilienkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustaendigeFamilienkasse(String newZustaendigeFamilienkasse) {
		String oldZustaendigeFamilienkasse = zustaendigeFamilienkasse;
		zustaendigeFamilienkasse = newZustaendigeFamilienkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE, oldZustaendigeFamilienkasse, zustaendigeFamilienkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS:
				return basicSetArtDesEinkommens(null, msgs);
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
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB:
				return getEinkommenAb();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN:
				return getHoeheEinkommen();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB:
				return getBezugKindergeldAb();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD:
				return getHoeheKindergeld();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS:
				return getArtDesEinkommens();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN:
				return getSonstigesEinkommen();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE:
				return getZustaendigeFamilienkasse();
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
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB:
				setEinkommenAb((String)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN:
				setHoeheEinkommen((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB:
				setBezugKindergeldAb((XMLGregorianCalendar)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD:
				setHoeheKindergeld((Float)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS:
				setArtDesEinkommens((CodeEinkommensartenType)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN:
				setSonstigesEinkommen((String)newValue);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE:
				setZustaendigeFamilienkasse((String)newValue);
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
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB:
				setEinkommenAb(EINKOMMEN_AB_EDEFAULT);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN:
				unsetHoeheEinkommen();
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB:
				setBezugKindergeldAb(BEZUG_KINDERGELD_AB_EDEFAULT);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD:
				unsetHoeheKindergeld();
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS:
				setArtDesEinkommens((CodeEinkommensartenType)null);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN:
				setSonstigesEinkommen(SONSTIGES_EINKOMMEN_EDEFAULT);
				return;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE:
				setZustaendigeFamilienkasse(ZUSTAENDIGE_FAMILIENKASSE_EDEFAULT);
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
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__EINKOMMEN_AB:
				return EINKOMMEN_AB_EDEFAULT == null ? einkommenAb != null : !EINKOMMEN_AB_EDEFAULT.equals(einkommenAb);
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_EINKOMMEN:
				return isSetHoeheEinkommen();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__BEZUG_KINDERGELD_AB:
				return BEZUG_KINDERGELD_AB_EDEFAULT == null ? bezugKindergeldAb != null : !BEZUG_KINDERGELD_AB_EDEFAULT.equals(bezugKindergeldAb);
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__HOEHE_KINDERGELD:
				return isSetHoeheKindergeld();
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ART_DES_EINKOMMENS:
				return artDesEinkommens != null;
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__SONSTIGES_EINKOMMEN:
				return SONSTIGES_EINKOMMEN_EDEFAULT == null ? sonstigesEinkommen != null : !SONSTIGES_EINKOMMEN_EDEFAULT.equals(sonstigesEinkommen);
			case AdoptionPackage.EINKOMMEN_PFLEGEKIND_TYPE__ZUSTAENDIGE_FAMILIENKASSE:
				return ZUSTAENDIGE_FAMILIENKASSE_EDEFAULT == null ? zustaendigeFamilienkasse != null : !ZUSTAENDIGE_FAMILIENKASSE_EDEFAULT.equals(zustaendigeFamilienkasse);
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
		result.append(" (einkommenAb: ");
		result.append(einkommenAb);
		result.append(", hoeheEinkommen: ");
		if (hoeheEinkommenESet) result.append(hoeheEinkommen); else result.append("<unset>");
		result.append(", bezugKindergeldAb: ");
		result.append(bezugKindergeldAb);
		result.append(", hoeheKindergeld: ");
		if (hoeheKindergeldESet) result.append(hoeheKindergeld); else result.append("<unset>");
		result.append(", sonstigesEinkommen: ");
		result.append(sonstigesEinkommen);
		result.append(", zustaendigeFamilienkasse: ");
		result.append(zustaendigeFamilienkasse);
		result.append(')');
		return result.toString();
	}

} //EinkommenPflegekindTypeImpl

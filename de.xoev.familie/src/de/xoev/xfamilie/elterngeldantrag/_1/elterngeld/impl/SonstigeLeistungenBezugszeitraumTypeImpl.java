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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SonstigeLeistungenBezugszeitraumType;

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
 * An implementation of the model object '<em><b>Sonstige Leistungen Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#isBezugElterngeldAusland <em>Bezug Elterngeld Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#getNachweisElterngeldAusland <em>Nachweis Elterngeld Ausland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#isBezugALGII <em>Bezug ALGII</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#getNachweisALGII <em>Nachweis ALGII</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#getNameSozialleistungstraeger <em>Name Sozialleistungstraeger</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SonstigeLeistungenBezugszeitraumTypeImpl#getAnschriftSozialleistungstraeger <em>Anschrift Sozialleistungstraeger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SonstigeLeistungenBezugszeitraumTypeImpl extends MinimalEObjectImpl.Container implements SonstigeLeistungenBezugszeitraumType {
	/**
	 * The default value of the '{@link #isBezugElterngeldAusland() <em>Bezug Elterngeld Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugElterngeldAusland()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_ELTERNGELD_AUSLAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugElterngeldAusland() <em>Bezug Elterngeld Ausland</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugElterngeldAusland()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugElterngeldAusland = BEZUG_ELTERNGELD_AUSLAND_EDEFAULT;

	/**
	 * This is true if the Bezug Elterngeld Ausland attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugElterngeldAuslandESet;

	/**
	 * The cached value of the '{@link #getNachweisElterngeldAusland() <em>Nachweis Elterngeld Ausland</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisElterngeldAusland()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisElterngeldAusland;

	/**
	 * The default value of the '{@link #isBezugALGII() <em>Bezug ALGII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugALGII()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_ALGII_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugALGII() <em>Bezug ALGII</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugALGII()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugALGII = BEZUG_ALGII_EDEFAULT;

	/**
	 * This is true if the Bezug ALGII attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugALGIIESet;

	/**
	 * The cached value of the '{@link #getNachweisALGII() <em>Nachweis ALGII</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisALGII()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisALGII;

	/**
	 * The default value of the '{@link #getNameSozialleistungstraeger() <em>Name Sozialleistungstraeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSozialleistungstraeger()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SOZIALLEISTUNGSTRAEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSozialleistungstraeger() <em>Name Sozialleistungstraeger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSozialleistungstraeger()
	 * @generated
	 * @ordered
	 */
	protected String nameSozialleistungstraeger = NAME_SOZIALLEISTUNGSTRAEGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschriftSozialleistungstraeger() <em>Anschrift Sozialleistungstraeger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftSozialleistungstraeger()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschriftSozialleistungstraeger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SonstigeLeistungenBezugszeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getSonstigeLeistungenBezugszeitraumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugElterngeldAusland() {
		return bezugElterngeldAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugElterngeldAusland(boolean newBezugElterngeldAusland) {
		boolean oldBezugElterngeldAusland = bezugElterngeldAusland;
		bezugElterngeldAusland = newBezugElterngeldAusland;
		boolean oldBezugElterngeldAuslandESet = bezugElterngeldAuslandESet;
		bezugElterngeldAuslandESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND, oldBezugElterngeldAusland, bezugElterngeldAusland, !oldBezugElterngeldAuslandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugElterngeldAusland() {
		boolean oldBezugElterngeldAusland = bezugElterngeldAusland;
		boolean oldBezugElterngeldAuslandESet = bezugElterngeldAuslandESet;
		bezugElterngeldAusland = BEZUG_ELTERNGELD_AUSLAND_EDEFAULT;
		bezugElterngeldAuslandESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND, oldBezugElterngeldAusland, BEZUG_ELTERNGELD_AUSLAND_EDEFAULT, oldBezugElterngeldAuslandESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugElterngeldAusland() {
		return bezugElterngeldAuslandESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisElterngeldAusland() {
		if (nachweisElterngeldAusland == null) {
			nachweisElterngeldAusland = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND);
		}
		return nachweisElterngeldAusland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugALGII() {
		return bezugALGII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugALGII(boolean newBezugALGII) {
		boolean oldBezugALGII = bezugALGII;
		bezugALGII = newBezugALGII;
		boolean oldBezugALGIIESet = bezugALGIIESet;
		bezugALGIIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII, oldBezugALGII, bezugALGII, !oldBezugALGIIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugALGII() {
		boolean oldBezugALGII = bezugALGII;
		boolean oldBezugALGIIESet = bezugALGIIESet;
		bezugALGII = BEZUG_ALGII_EDEFAULT;
		bezugALGIIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII, oldBezugALGII, BEZUG_ALGII_EDEFAULT, oldBezugALGIIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugALGII() {
		return bezugALGIIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisALGII() {
		if (nachweisALGII == null) {
			nachweisALGII = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII);
		}
		return nachweisALGII;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameSozialleistungstraeger() {
		return nameSozialleistungstraeger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameSozialleistungstraeger(String newNameSozialleistungstraeger) {
		String oldNameSozialleistungstraeger = nameSozialleistungstraeger;
		nameSozialleistungstraeger = newNameSozialleistungstraeger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER, oldNameSozialleistungstraeger, nameSozialleistungstraeger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschriftSozialleistungstraeger() {
		return anschriftSozialleistungstraeger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftSozialleistungstraeger(PostalischeInlandsanschriftBasisType newAnschriftSozialleistungstraeger, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschriftSozialleistungstraeger = anschriftSozialleistungstraeger;
		anschriftSozialleistungstraeger = newAnschriftSozialleistungstraeger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER, oldAnschriftSozialleistungstraeger, newAnschriftSozialleistungstraeger);
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
	public void setAnschriftSozialleistungstraeger(PostalischeInlandsanschriftBasisType newAnschriftSozialleistungstraeger) {
		if (newAnschriftSozialleistungstraeger != anschriftSozialleistungstraeger) {
			NotificationChain msgs = null;
			if (anschriftSozialleistungstraeger != null)
				msgs = ((InternalEObject)anschriftSozialleistungstraeger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER, null, msgs);
			if (newAnschriftSozialleistungstraeger != null)
				msgs = ((InternalEObject)newAnschriftSozialleistungstraeger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER, null, msgs);
			msgs = basicSetAnschriftSozialleistungstraeger(newAnschriftSozialleistungstraeger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER, newAnschriftSozialleistungstraeger, newAnschriftSozialleistungstraeger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND:
				return ((InternalEList<?>)getNachweisElterngeldAusland()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII:
				return ((InternalEList<?>)getNachweisALGII()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER:
				return basicSetAnschriftSozialleistungstraeger(null, msgs);
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
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND:
				return isBezugElterngeldAusland();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND:
				return getNachweisElterngeldAusland();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII:
				return isBezugALGII();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII:
				return getNachweisALGII();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER:
				return getNameSozialleistungstraeger();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER:
				return getAnschriftSozialleistungstraeger();
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
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND:
				setBezugElterngeldAusland((Boolean)newValue);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND:
				getNachweisElterngeldAusland().clear();
				getNachweisElterngeldAusland().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII:
				setBezugALGII((Boolean)newValue);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII:
				getNachweisALGII().clear();
				getNachweisALGII().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER:
				setNameSozialleistungstraeger((String)newValue);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER:
				setAnschriftSozialleistungstraeger((PostalischeInlandsanschriftBasisType)newValue);
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
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND:
				unsetBezugElterngeldAusland();
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND:
				getNachweisElterngeldAusland().clear();
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII:
				unsetBezugALGII();
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII:
				getNachweisALGII().clear();
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER:
				setNameSozialleistungstraeger(NAME_SOZIALLEISTUNGSTRAEGER_EDEFAULT);
				return;
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER:
				setAnschriftSozialleistungstraeger((PostalischeInlandsanschriftBasisType)null);
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
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ELTERNGELD_AUSLAND:
				return isSetBezugElterngeldAusland();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ELTERNGELD_AUSLAND:
				return nachweisElterngeldAusland != null && !nachweisElterngeldAusland.isEmpty();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__BEZUG_ALGII:
				return isSetBezugALGII();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NACHWEIS_ALGII:
				return nachweisALGII != null && !nachweisALGII.isEmpty();
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__NAME_SOZIALLEISTUNGSTRAEGER:
				return NAME_SOZIALLEISTUNGSTRAEGER_EDEFAULT == null ? nameSozialleistungstraeger != null : !NAME_SOZIALLEISTUNGSTRAEGER_EDEFAULT.equals(nameSozialleistungstraeger);
			case ElterngeldPackage.SONSTIGE_LEISTUNGEN_BEZUGSZEITRAUM_TYPE__ANSCHRIFT_SOZIALLEISTUNGSTRAEGER:
				return anschriftSozialleistungstraeger != null;
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
		result.append(" (bezugElterngeldAusland: ");
		if (bezugElterngeldAuslandESet) result.append(bezugElterngeldAusland); else result.append("<unset>");
		result.append(", bezugALGII: ");
		if (bezugALGIIESet) result.append(bezugALGII); else result.append("<unset>");
		result.append(", nameSozialleistungstraeger: ");
		result.append(nameSozialleistungstraeger);
		result.append(')');
		return result.toString();
	}

} //SonstigeLeistungenBezugszeitraumTypeImpl

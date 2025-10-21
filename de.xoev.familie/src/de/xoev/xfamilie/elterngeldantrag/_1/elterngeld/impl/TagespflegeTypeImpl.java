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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.TagespflegeType;

import java.math.BigInteger;

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
 * An implementation of the model object '<em><b>Tagespflege Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TagespflegeTypeImpl#isTagespflege <em>Tagespflege</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TagespflegeTypeImpl#getAnzahlDerKinderOhneEigeneKinder <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.TagespflegeTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagespflegeTypeImpl extends MinimalEObjectImpl.Container implements TagespflegeType {
	/**
	 * The default value of the '{@link #isTagespflege() <em>Tagespflege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTagespflege()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TAGESPFLEGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTagespflege() <em>Tagespflege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTagespflege()
	 * @generated
	 * @ordered
	 */
	protected boolean tagespflege = TAGESPFLEGE_EDEFAULT;

	/**
	 * This is true if the Tagespflege attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagespflegeESet;

	/**
	 * The default value of the '{@link #getAnzahlDerKinderOhneEigeneKinder() <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlDerKinderOhneEigeneKinder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzahlDerKinderOhneEigeneKinder() <em>Anzahl Der Kinder Ohne Eigene Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlDerKinderOhneEigeneKinder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anzahlDerKinderOhneEigeneKinder = ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagespflegeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getTagespflegeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTagespflege() {
		return tagespflege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagespflege(boolean newTagespflege) {
		boolean oldTagespflege = tagespflege;
		tagespflege = newTagespflege;
		boolean oldTagespflegeESet = tagespflegeESet;
		tagespflegeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE, oldTagespflege, tagespflege, !oldTagespflegeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTagespflege() {
		boolean oldTagespflege = tagespflege;
		boolean oldTagespflegeESet = tagespflegeESet;
		tagespflege = TAGESPFLEGE_EDEFAULT;
		tagespflegeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE, oldTagespflege, TAGESPFLEGE_EDEFAULT, oldTagespflegeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTagespflege() {
		return tagespflegeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAnzahlDerKinderOhneEigeneKinder() {
		return anzahlDerKinderOhneEigeneKinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlDerKinderOhneEigeneKinder(BigInteger newAnzahlDerKinderOhneEigeneKinder) {
		BigInteger oldAnzahlDerKinderOhneEigeneKinder = anzahlDerKinderOhneEigeneKinder;
		anzahlDerKinderOhneEigeneKinder = newAnzahlDerKinderOhneEigeneKinder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER, oldAnzahlDerKinderOhneEigeneKinder, anzahlDerKinderOhneEigeneKinder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE:
				return isTagespflege();
			case ElterngeldPackage.TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER:
				return getAnzahlDerKinderOhneEigeneKinder();
			case ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS:
				return getNachweis();
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
			case ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE:
				setTagespflege((Boolean)newValue);
				return;
			case ElterngeldPackage.TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER:
				setAnzahlDerKinderOhneEigeneKinder((BigInteger)newValue);
				return;
			case ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE:
				unsetTagespflege();
				return;
			case ElterngeldPackage.TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER:
				setAnzahlDerKinderOhneEigeneKinder(ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER_EDEFAULT);
				return;
			case ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS:
				getNachweis().clear();
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
			case ElterngeldPackage.TAGESPFLEGE_TYPE__TAGESPFLEGE:
				return isSetTagespflege();
			case ElterngeldPackage.TAGESPFLEGE_TYPE__ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER:
				return ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER_EDEFAULT == null ? anzahlDerKinderOhneEigeneKinder != null : !ANZAHL_DER_KINDER_OHNE_EIGENE_KINDER_EDEFAULT.equals(anzahlDerKinderOhneEigeneKinder);
			case ElterngeldPackage.TAGESPFLEGE_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
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
		result.append(" (tagespflege: ");
		if (tagespflegeESet) result.append(tagespflege); else result.append("<unset>");
		result.append(", anzahlDerKinderOhneEigeneKinder: ");
		result.append(anzahlDerKinderOhneEigeneKinder);
		result.append(')');
		return result.toString();
	}

} //TagespflegeTypeImpl

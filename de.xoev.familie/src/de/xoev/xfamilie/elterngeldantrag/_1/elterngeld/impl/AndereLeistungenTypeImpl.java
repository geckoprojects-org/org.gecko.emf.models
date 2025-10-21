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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AndereLeistungenType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Andere Leistungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl#isBezugAndereLeistungen <em>Bezug Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl#getZeitraumAndereLeistungen <em>Zeitraum Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl#getNachweisAndereLeistungen <em>Nachweis Andere Leistungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AndereLeistungenTypeImpl#getArtAndereLeistungen <em>Art Andere Leistungen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AndereLeistungenTypeImpl extends MinimalEObjectImpl.Container implements AndereLeistungenType {
	/**
	 * The default value of the '{@link #isBezugAndereLeistungen() <em>Bezug Andere Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_ANDERE_LEISTUNGEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugAndereLeistungen() <em>Bezug Andere Leistungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugAndereLeistungen = BEZUG_ANDERE_LEISTUNGEN_EDEFAULT;

	/**
	 * This is true if the Bezug Andere Leistungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugAndereLeistungenESet;

	/**
	 * The cached value of the '{@link #getZeitraumAndereLeistungen() <em>Zeitraum Andere Leistungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumAndereLeistungen;

	/**
	 * The cached value of the '{@link #getNachweisAndereLeistungen() <em>Nachweis Andere Leistungen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisAndereLeistungen;

	/**
	 * The cached value of the '{@link #getArtAndereLeistungen() <em>Art Andere Leistungen</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtAndereLeistungen()
	 * @generated
	 * @ordered
	 */
	protected EList<String> artAndereLeistungen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AndereLeistungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAndereLeistungenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugAndereLeistungen() {
		return bezugAndereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugAndereLeistungen(boolean newBezugAndereLeistungen) {
		boolean oldBezugAndereLeistungen = bezugAndereLeistungen;
		bezugAndereLeistungen = newBezugAndereLeistungen;
		boolean oldBezugAndereLeistungenESet = bezugAndereLeistungenESet;
		bezugAndereLeistungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN, oldBezugAndereLeistungen, bezugAndereLeistungen, !oldBezugAndereLeistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugAndereLeistungen() {
		boolean oldBezugAndereLeistungen = bezugAndereLeistungen;
		boolean oldBezugAndereLeistungenESet = bezugAndereLeistungenESet;
		bezugAndereLeistungen = BEZUG_ANDERE_LEISTUNGEN_EDEFAULT;
		bezugAndereLeistungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN, oldBezugAndereLeistungen, BEZUG_ANDERE_LEISTUNGEN_EDEFAULT, oldBezugAndereLeistungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugAndereLeistungen() {
		return bezugAndereLeistungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumAndereLeistungen() {
		if (zeitraumAndereLeistungen == null) {
			zeitraumAndereLeistungen = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN);
		}
		return zeitraumAndereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisAndereLeistungen() {
		if (nachweisAndereLeistungen == null) {
			nachweisAndereLeistungen = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN);
		}
		return nachweisAndereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArtAndereLeistungen() {
		if (artAndereLeistungen == null) {
			artAndereLeistungen = new EDataTypeEList<String>(String.class, this, ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN);
		}
		return artAndereLeistungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN:
				return ((InternalEList<?>)getZeitraumAndereLeistungen()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN:
				return ((InternalEList<?>)getNachweisAndereLeistungen()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				return isBezugAndereLeistungen();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN:
				return getZeitraumAndereLeistungen();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN:
				return getNachweisAndereLeistungen();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN:
				return getArtAndereLeistungen();
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
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				setBezugAndereLeistungen((Boolean)newValue);
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN:
				getZeitraumAndereLeistungen().clear();
				getZeitraumAndereLeistungen().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN:
				getNachweisAndereLeistungen().clear();
				getNachweisAndereLeistungen().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN:
				getArtAndereLeistungen().clear();
				getArtAndereLeistungen().addAll((Collection<? extends String>)newValue);
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
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				unsetBezugAndereLeistungen();
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN:
				getZeitraumAndereLeistungen().clear();
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN:
				getNachweisAndereLeistungen().clear();
				return;
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN:
				getArtAndereLeistungen().clear();
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
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__BEZUG_ANDERE_LEISTUNGEN:
				return isSetBezugAndereLeistungen();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ZEITRAUM_ANDERE_LEISTUNGEN:
				return zeitraumAndereLeistungen != null && !zeitraumAndereLeistungen.isEmpty();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__NACHWEIS_ANDERE_LEISTUNGEN:
				return nachweisAndereLeistungen != null && !nachweisAndereLeistungen.isEmpty();
			case ElterngeldPackage.ANDERE_LEISTUNGEN_TYPE__ART_ANDERE_LEISTUNGEN:
				return artAndereLeistungen != null && !artAndereLeistungen.isEmpty();
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
		result.append(" (bezugAndereLeistungen: ");
		if (bezugAndereLeistungenESet) result.append(bezugAndereLeistungen); else result.append("<unset>");
		result.append(", artAndereLeistungen: ");
		result.append(artAndereLeistungen);
		result.append(')');
		return result.toString();
	}

} //AndereLeistungenTypeImpl

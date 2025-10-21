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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.RentenType;

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
 * An implementation of the model object '<em><b>Renten Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl#isBezugRente <em>Bezug Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl#getZeitraumRente <em>Zeitraum Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl#getNachweisRente <em>Nachweis Rente</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.RentenTypeImpl#getArtRente <em>Art Rente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RentenTypeImpl extends MinimalEObjectImpl.Container implements RentenType {
	/**
	 * The default value of the '{@link #isBezugRente() <em>Bezug Rente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugRente()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_RENTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugRente() <em>Bezug Rente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugRente()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugRente = BEZUG_RENTE_EDEFAULT;

	/**
	 * This is true if the Bezug Rente attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugRenteESet;

	/**
	 * The cached value of the '{@link #getZeitraumRente() <em>Zeitraum Rente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumRente()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraumRente;

	/**
	 * The cached value of the '{@link #getNachweisRente() <em>Nachweis Rente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisRente()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisRente;

	/**
	 * The cached value of the '{@link #getArtRente() <em>Art Rente</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtRente()
	 * @generated
	 * @ordered
	 */
	protected EList<String> artRente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RentenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getRentenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugRente() {
		return bezugRente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugRente(boolean newBezugRente) {
		boolean oldBezugRente = bezugRente;
		bezugRente = newBezugRente;
		boolean oldBezugRenteESet = bezugRenteESet;
		bezugRenteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE, oldBezugRente, bezugRente, !oldBezugRenteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugRente() {
		boolean oldBezugRente = bezugRente;
		boolean oldBezugRenteESet = bezugRenteESet;
		bezugRente = BEZUG_RENTE_EDEFAULT;
		bezugRenteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE, oldBezugRente, BEZUG_RENTE_EDEFAULT, oldBezugRenteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugRente() {
		return bezugRenteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraumRente() {
		if (zeitraumRente == null) {
			zeitraumRente = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE);
		}
		return zeitraumRente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisRente() {
		if (nachweisRente == null) {
			nachweisRente = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE);
		}
		return nachweisRente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArtRente() {
		if (artRente == null) {
			artRente = new EDataTypeEList<String>(String.class, this, ElterngeldPackage.RENTEN_TYPE__ART_RENTE);
		}
		return artRente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE:
				return ((InternalEList<?>)getZeitraumRente()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE:
				return ((InternalEList<?>)getNachweisRente()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE:
				return isBezugRente();
			case ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE:
				return getZeitraumRente();
			case ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE:
				return getNachweisRente();
			case ElterngeldPackage.RENTEN_TYPE__ART_RENTE:
				return getArtRente();
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
			case ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE:
				setBezugRente((Boolean)newValue);
				return;
			case ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE:
				getZeitraumRente().clear();
				getZeitraumRente().addAll((Collection<? extends ZeitraumType>)newValue);
				return;
			case ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE:
				getNachweisRente().clear();
				getNachweisRente().addAll((Collection<? extends NachweisdokumentType>)newValue);
				return;
			case ElterngeldPackage.RENTEN_TYPE__ART_RENTE:
				getArtRente().clear();
				getArtRente().addAll((Collection<? extends String>)newValue);
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
			case ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE:
				unsetBezugRente();
				return;
			case ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE:
				getZeitraumRente().clear();
				return;
			case ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE:
				getNachweisRente().clear();
				return;
			case ElterngeldPackage.RENTEN_TYPE__ART_RENTE:
				getArtRente().clear();
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
			case ElterngeldPackage.RENTEN_TYPE__BEZUG_RENTE:
				return isSetBezugRente();
			case ElterngeldPackage.RENTEN_TYPE__ZEITRAUM_RENTE:
				return zeitraumRente != null && !zeitraumRente.isEmpty();
			case ElterngeldPackage.RENTEN_TYPE__NACHWEIS_RENTE:
				return nachweisRente != null && !nachweisRente.isEmpty();
			case ElterngeldPackage.RENTEN_TYPE__ART_RENTE:
				return artRente != null && !artRente.isEmpty();
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
		result.append(" (bezugRente: ");
		if (bezugRenteESet) result.append(bezugRente); else result.append("<unset>");
		result.append(", artRente: ");
		result.append(artRente);
		result.append(')');
		return result.toString();
	}

} //RentenTypeImpl

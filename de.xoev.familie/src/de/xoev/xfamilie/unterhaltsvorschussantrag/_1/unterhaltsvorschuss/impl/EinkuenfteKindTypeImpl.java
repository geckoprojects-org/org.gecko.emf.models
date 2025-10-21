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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeEinkuenfteKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.EinkuenfteKindType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

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
 * An implementation of the model object '<em><b>Einkuenfte Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl#getBetragDerEinkuenfte <em>Betrag Der Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.EinkuenfteKindTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinkuenfteKindTypeImpl extends MinimalEObjectImpl.Container implements EinkuenfteKindType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeEinkuenfteKindType art;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nachweis;

	/**
	 * The default value of the '{@link #getBetragDerEinkuenfte() <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected static final String BETRAG_DER_EINKUENFTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetragDerEinkuenfte() <em>Betrag Der Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetragDerEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected String betragDerEinkuenfte = BETRAG_DER_EINKUENFTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected EList<ZeitraumType> zeitraum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinkuenfteKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getEinkuenfteKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEinkuenfteKindType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeEinkuenfteKindType newArt, NotificationChain msgs) {
		CodeEinkuenfteKindType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeEinkuenfteKindType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBetragDerEinkuenfte() {
		return betragDerEinkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetragDerEinkuenfte(String newBetragDerEinkuenfte) {
		String oldBetragDerEinkuenfte = betragDerEinkuenfte;
		betragDerEinkuenfte = newBetragDerEinkuenfte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE, oldBetragDerEinkuenfte, betragDerEinkuenfte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZeitraumType> getZeitraum() {
		if (zeitraum == null) {
			zeitraum = new EObjectContainmentEList<ZeitraumType>(ZeitraumType.class, this, UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM);
		}
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART:
				return basicSetArt(null, msgs);
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM:
				return ((InternalEList<?>)getZeitraum()).basicRemove(otherEnd, msgs);
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
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE:
				return getBetragDerEinkuenfte();
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM:
				return getZeitraum();
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
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART:
				setArt((CodeEinkuenfteKindType)newValue);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE:
				setBetragDerEinkuenfte((String)newValue);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM:
				getZeitraum().clear();
				getZeitraum().addAll((Collection<? extends ZeitraumType>)newValue);
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
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART:
				setArt((CodeEinkuenfteKindType)null);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE:
				setBetragDerEinkuenfte(BETRAG_DER_EINKUENFTE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM:
				getZeitraum().clear();
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
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__BETRAG_DER_EINKUENFTE:
				return BETRAG_DER_EINKUENFTE_EDEFAULT == null ? betragDerEinkuenfte != null : !BETRAG_DER_EINKUENFTE_EDEFAULT.equals(betragDerEinkuenfte);
			case UnterhaltsvorschussPackage.EINKUENFTE_KIND_TYPE__ZEITRAUM:
				return zeitraum != null && !zeitraum.isEmpty();
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
		result.append(" (nachweis: ");
		result.append(nachweis);
		result.append(", betragDerEinkuenfte: ");
		result.append(betragDerEinkuenfte);
		result.append(')');
		return result.toString();
	}

} //EinkuenfteKindTypeImpl

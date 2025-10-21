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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BemuehungenUnterhaltType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.CodeUnterhaltsbemuehungenType;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bemuehungen Unterhalt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl#getGenauereAngaben <em>Genauere Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.BemuehungenUnterhaltTypeImpl#getGruende <em>Gruende</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BemuehungenUnterhaltTypeImpl extends MinimalEObjectImpl.Container implements BemuehungenUnterhaltType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeUnterhaltsbemuehungenType art;

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
	 * The default value of the '{@link #getGenauereAngaben() <em>Genauere Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenauereAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final String GENAUERE_ANGABEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenauereAngaben() <em>Genauere Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenauereAngaben()
	 * @generated
	 * @ordered
	 */
	protected String genauereAngaben = GENAUERE_ANGABEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGruende() <em>Gruende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruende()
	 * @generated
	 * @ordered
	 */
	protected static final String GRUENDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGruende() <em>Gruende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruende()
	 * @generated
	 * @ordered
	 */
	protected String gruende = GRUENDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BemuehungenUnterhaltTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getBemuehungenUnterhaltType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeUnterhaltsbemuehungenType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeUnterhaltsbemuehungenType newArt, NotificationChain msgs) {
		CodeUnterhaltsbemuehungenType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeUnterhaltsbemuehungenType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNachweis() {
		if (nachweis == null) {
			nachweis = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenauereAngaben() {
		return genauereAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenauereAngaben(String newGenauereAngaben) {
		String oldGenauereAngaben = genauereAngaben;
		genauereAngaben = newGenauereAngaben;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN, oldGenauereAngaben, genauereAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGruende() {
		return gruende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGruende(String newGruende) {
		String oldGruende = gruende;
		gruende = newGruende;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE, oldGruende, gruende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART:
				return basicSetArt(null, msgs);
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
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS:
				return getNachweis();
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN:
				return getGenauereAngaben();
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE:
				return getGruende();
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
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART:
				setArt((CodeUnterhaltsbemuehungenType)newValue);
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends String>)newValue);
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN:
				setGenauereAngaben((String)newValue);
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE:
				setGruende((String)newValue);
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
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART:
				setArt((CodeUnterhaltsbemuehungenType)null);
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN:
				setGenauereAngaben(GENAUERE_ANGABEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE:
				setGruende(GRUENDE_EDEFAULT);
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
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GENAUERE_ANGABEN:
				return GENAUERE_ANGABEN_EDEFAULT == null ? genauereAngaben != null : !GENAUERE_ANGABEN_EDEFAULT.equals(genauereAngaben);
			case UnterhaltsvorschussPackage.BEMUEHUNGEN_UNTERHALT_TYPE__GRUENDE:
				return GRUENDE_EDEFAULT == null ? gruende != null : !GRUENDE_EDEFAULT.equals(gruende);
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
		result.append(", genauereAngaben: ");
		result.append(genauereAngaben);
		result.append(", gruende: ");
		result.append(gruende);
		result.append(')');
		return result.toString();
	}

} //BemuehungenUnterhaltTypeImpl

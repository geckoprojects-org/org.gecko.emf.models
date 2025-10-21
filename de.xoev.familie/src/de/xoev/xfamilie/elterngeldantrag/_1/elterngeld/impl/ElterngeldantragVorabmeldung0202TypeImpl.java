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

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AntragstellenderElternteilVorabmeldungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.KindVorabmeldungType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elterngeldantrag Vorabmeldung0202 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragVorabmeldung0202TypeImpl#getAntragstellenerElternteilVorabmeldung <em>Antragstellener Elternteil Vorabmeldung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragVorabmeldung0202TypeImpl#getAngabenKindVorabmeldung <em>Angaben Kind Vorabmeldung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElterngeldantragVorabmeldung0202TypeImpl#getAntragsdokumente <em>Antragsdokumente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElterngeldantragVorabmeldung0202TypeImpl extends AntragsnachrichtTypeImpl implements ElterngeldantragVorabmeldung0202Type {
	/**
	 * The cached value of the '{@link #getAntragstellenerElternteilVorabmeldung() <em>Antragstellener Elternteil Vorabmeldung</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellenerElternteilVorabmeldung()
	 * @generated
	 * @ordered
	 */
	protected EList<AntragstellenderElternteilVorabmeldungType> antragstellenerElternteilVorabmeldung;

	/**
	 * The cached value of the '{@link #getAngabenKindVorabmeldung() <em>Angaben Kind Vorabmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenKindVorabmeldung()
	 * @generated
	 * @ordered
	 */
	protected KindVorabmeldungType angabenKindVorabmeldung;

	/**
	 * The cached value of the '{@link #getAntragsdokumente() <em>Antragsdokumente</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsdokumente()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> antragsdokumente;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElterngeldantragVorabmeldung0202TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElterngeldantragVorabmeldung0202Type();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AntragstellenderElternteilVorabmeldungType> getAntragstellenerElternteilVorabmeldung() {
		if (antragstellenerElternteilVorabmeldung == null) {
			antragstellenerElternteilVorabmeldung = new EObjectContainmentEList<AntragstellenderElternteilVorabmeldungType>(AntragstellenderElternteilVorabmeldungType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG);
		}
		return antragstellenerElternteilVorabmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KindVorabmeldungType getAngabenKindVorabmeldung() {
		return angabenKindVorabmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenKindVorabmeldung(KindVorabmeldungType newAngabenKindVorabmeldung, NotificationChain msgs) {
		KindVorabmeldungType oldAngabenKindVorabmeldung = angabenKindVorabmeldung;
		angabenKindVorabmeldung = newAngabenKindVorabmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG, oldAngabenKindVorabmeldung, newAngabenKindVorabmeldung);
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
	public void setAngabenKindVorabmeldung(KindVorabmeldungType newAngabenKindVorabmeldung) {
		if (newAngabenKindVorabmeldung != angabenKindVorabmeldung) {
			NotificationChain msgs = null;
			if (angabenKindVorabmeldung != null)
				msgs = ((InternalEObject)angabenKindVorabmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG, null, msgs);
			if (newAngabenKindVorabmeldung != null)
				msgs = ((InternalEObject)newAngabenKindVorabmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG, null, msgs);
			msgs = basicSetAngabenKindVorabmeldung(newAngabenKindVorabmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG, newAngabenKindVorabmeldung, newAngabenKindVorabmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getAntragsdokumente() {
		if (antragsdokumente == null) {
			antragsdokumente = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE);
		}
		return antragsdokumente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG:
				return ((InternalEList<?>)getAntragstellenerElternteilVorabmeldung()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG:
				return basicSetAngabenKindVorabmeldung(null, msgs);
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE:
				return ((InternalEList<?>)getAntragsdokumente()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG:
				return getAntragstellenerElternteilVorabmeldung();
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG:
				return getAngabenKindVorabmeldung();
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE:
				return getAntragsdokumente();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG:
				getAntragstellenerElternteilVorabmeldung().clear();
				getAntragstellenerElternteilVorabmeldung().addAll((Collection<? extends AntragstellenderElternteilVorabmeldungType>)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG:
				setAngabenKindVorabmeldung((KindVorabmeldungType)newValue);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE:
				getAntragsdokumente().clear();
				getAntragsdokumente().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG:
				getAntragstellenerElternteilVorabmeldung().clear();
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG:
				setAngabenKindVorabmeldung((KindVorabmeldungType)null);
				return;
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE:
				getAntragsdokumente().clear();
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
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSTELLENER_ELTERNTEIL_VORABMELDUNG:
				return antragstellenerElternteilVorabmeldung != null && !antragstellenerElternteilVorabmeldung.isEmpty();
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANGABEN_KIND_VORABMELDUNG:
				return angabenKindVorabmeldung != null;
			case ElterngeldPackage.ELTERNGELDANTRAG_VORABMELDUNG0202_TYPE__ANTRAGSDOKUMENTE:
				return antragsdokumente != null && !antragsdokumente.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElterngeldantragVorabmeldung0202TypeImpl

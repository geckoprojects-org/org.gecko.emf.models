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

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abgebender Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getElternteil <em>Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getEinstellungAdoptionsabsicht <em>Einstellung Adoptionsabsicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AbgebenderElternteilTypeImpl#getElternteilVerstorben <em>Elternteil Verstorben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbgebenderElternteilTypeImpl extends MinimalEObjectImpl.Container implements AbgebenderElternteilType {
	/**
	 * The cached value of the '{@link #getElternteil() <em>Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteil()
	 * @generated
	 * @ordered
	 */
	protected CodeKindschaftsbeziehungType elternteil;

	/**
	 * The cached value of the '{@link #getPersonendaten() <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonendaten()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType personendaten;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtOptionalType geburt;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * The default value of the '{@link #getEinstellungAdoptionsabsicht() <em>Einstellung Adoptionsabsicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstellungAdoptionsabsicht()
	 * @generated
	 * @ordered
	 */
	protected static final String EINSTELLUNG_ADOPTIONSABSICHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEinstellungAdoptionsabsicht() <em>Einstellung Adoptionsabsicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstellungAdoptionsabsicht()
	 * @generated
	 * @ordered
	 */
	protected String einstellungAdoptionsabsicht = EINSTELLUNG_ADOPTIONSABSICHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAufenthaltsstatus() <em>Aufenthaltsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsstatus()
	 * @generated
	 * @ordered
	 */
	protected CodeAufenthaltsstatusType aufenthaltsstatus;

	/**
	 * The cached value of the '{@link #getElternteilVerstorben() <em>Elternteil Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElternteilVerstorben()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType elternteilVerstorben;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbgebenderElternteilTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ABGEBENDER_ELTERNTEIL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeKindschaftsbeziehungType getElternteil() {
		return elternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternteil(CodeKindschaftsbeziehungType newElternteil, NotificationChain msgs) {
		CodeKindschaftsbeziehungType oldElternteil = elternteil;
		elternteil = newElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL, oldElternteil, newElternteil);
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
	public void setElternteil(CodeKindschaftsbeziehungType newElternteil) {
		if (newElternteil != elternteil) {
			NotificationChain msgs = null;
			if (elternteil != null)
				msgs = ((InternalEObject)elternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL, null, msgs);
			if (newElternteil != null)
				msgs = ((InternalEObject)newElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL, null, msgs);
			msgs = basicSetElternteil(newElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL, newElternteil, newElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType getPersonendaten() {
		return personendaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonendaten(PersonendatenType newPersonendaten, NotificationChain msgs) {
		PersonendatenType oldPersonendaten = personendaten;
		personendaten = newPersonendaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
	public void setPersonendaten(PersonendatenType newPersonendaten) {
		if (newPersonendaten != personendaten) {
			NotificationChain msgs = null;
			if (personendaten != null)
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtOptionalType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtOptionalType newGeburt, NotificationChain msgs) {
		GeburtOptionalType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtOptionalType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(CodeStaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		CodeStaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEinstellungAdoptionsabsicht() {
		return einstellungAdoptionsabsicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinstellungAdoptionsabsicht(String newEinstellungAdoptionsabsicht) {
		String oldEinstellungAdoptionsabsicht = einstellungAdoptionsabsicht;
		einstellungAdoptionsabsicht = newEinstellungAdoptionsabsicht;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT, oldEinstellungAdoptionsabsicht, einstellungAdoptionsabsicht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAufenthaltsstatusType getAufenthaltsstatus() {
		return aufenthaltsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufenthaltsstatus(CodeAufenthaltsstatusType newAufenthaltsstatus, NotificationChain msgs) {
		CodeAufenthaltsstatusType oldAufenthaltsstatus = aufenthaltsstatus;
		aufenthaltsstatus = newAufenthaltsstatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS, oldAufenthaltsstatus, newAufenthaltsstatus);
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
	public void setAufenthaltsstatus(CodeAufenthaltsstatusType newAufenthaltsstatus) {
		if (newAufenthaltsstatus != aufenthaltsstatus) {
			NotificationChain msgs = null;
			if (aufenthaltsstatus != null)
				msgs = ((InternalEObject)aufenthaltsstatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS, null, msgs);
			if (newAufenthaltsstatus != null)
				msgs = ((InternalEObject)newAufenthaltsstatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS, null, msgs);
			msgs = basicSetAufenthaltsstatus(newAufenthaltsstatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS, newAufenthaltsstatus, newAufenthaltsstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getElternteilVerstorben() {
		return elternteilVerstorben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElternteilVerstorben(TeilbekanntesDatumType newElternteilVerstorben, NotificationChain msgs) {
		TeilbekanntesDatumType oldElternteilVerstorben = elternteilVerstorben;
		elternteilVerstorben = newElternteilVerstorben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN, oldElternteilVerstorben, newElternteilVerstorben);
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
	public void setElternteilVerstorben(TeilbekanntesDatumType newElternteilVerstorben) {
		if (newElternteilVerstorben != elternteilVerstorben) {
			NotificationChain msgs = null;
			if (elternteilVerstorben != null)
				msgs = ((InternalEObject)elternteilVerstorben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN, null, msgs);
			if (newElternteilVerstorben != null)
				msgs = ((InternalEObject)newElternteilVerstorben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN, null, msgs);
			msgs = basicSetElternteilVerstorben(newElternteilVerstorben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN, newElternteilVerstorben, newElternteilVerstorben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL:
				return basicSetElternteil(null, msgs);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS:
				return basicSetAufenthaltsstatus(null, msgs);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN:
				return basicSetElternteilVerstorben(null, msgs);
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
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL:
				return getElternteil();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT:
				return getGeburt();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT:
				return getEinstellungAdoptionsabsicht();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS:
				return getAufenthaltsstatus();
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN:
				return getElternteilVerstorben();
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
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL:
				setElternteil((CodeKindschaftsbeziehungType)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT:
				setEinstellungAdoptionsabsicht((String)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)newValue);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN:
				setElternteilVerstorben((TeilbekanntesDatumType)newValue);
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
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL:
				setElternteil((CodeKindschaftsbeziehungType)null);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)null);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT:
				setEinstellungAdoptionsabsicht(EINSTELLUNG_ADOPTIONSABSICHT_EDEFAULT);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)null);
				return;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN:
				setElternteilVerstorben((TeilbekanntesDatumType)null);
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
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL:
				return elternteil != null;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__GEBURT:
				return geburt != null;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__EINSTELLUNG_ADOPTIONSABSICHT:
				return EINSTELLUNG_ADOPTIONSABSICHT_EDEFAULT == null ? einstellungAdoptionsabsicht != null : !EINSTELLUNG_ADOPTIONSABSICHT_EDEFAULT.equals(einstellungAdoptionsabsicht);
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__AUFENTHALTSSTATUS:
				return aufenthaltsstatus != null;
			case AdoptionPackage.ABGEBENDER_ELTERNTEIL_TYPE__ELTERNTEIL_VERSTORBEN:
				return elternteilVerstorben != null;
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
		result.append(" (einstellungAdoptionsabsicht: ");
		result.append(einstellungAdoptionsabsicht);
		result.append(')');
		return result.toString();
	}

} //AbgebenderElternteilTypeImpl

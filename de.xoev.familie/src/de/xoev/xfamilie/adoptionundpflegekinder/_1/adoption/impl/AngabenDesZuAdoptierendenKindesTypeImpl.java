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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Des Zu Adoptierenden Kindes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#isAusAuslandGeholt <em>Aus Ausland Geholt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenDesZuAdoptierendenKindesTypeImpl#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenDesZuAdoptierendenKindesTypeImpl extends MinimalEObjectImpl.Container implements AngabenDesZuAdoptierendenKindesType {
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
	 * The default value of the '{@link #getReligionszugehoerigkeit() <em>Religionszugehoerigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReligionszugehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIGIONSZUGEHOERIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReligionszugehoerigkeit() <em>Religionszugehoerigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReligionszugehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected String religionszugehoerigkeit = RELIGIONSZUGEHOERIGKEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAusAuslandGeholt() <em>Aus Ausland Geholt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAusAuslandGeholt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUS_AUSLAND_GEHOLT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAusAuslandGeholt() <em>Aus Ausland Geholt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAusAuslandGeholt()
	 * @generated
	 * @ordered
	 */
	protected boolean ausAuslandGeholt = AUS_AUSLAND_GEHOLT_EDEFAULT;

	/**
	 * This is true if the Aus Ausland Geholt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ausAuslandGeholtESet;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected MeldeanschriftType anschrift;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenDesZuAdoptierendenKindesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT, oldGeburt, newGeburt);
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
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT, newGeburt, newGeburt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReligionszugehoerigkeit() {
		return religionszugehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReligionszugehoerigkeit(String newReligionszugehoerigkeit) {
		String oldReligionszugehoerigkeit = religionszugehoerigkeit;
		religionszugehoerigkeit = newReligionszugehoerigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT, oldReligionszugehoerigkeit, religionszugehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAusAuslandGeholt() {
		return ausAuslandGeholt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAusAuslandGeholt(boolean newAusAuslandGeholt) {
		boolean oldAusAuslandGeholt = ausAuslandGeholt;
		ausAuslandGeholt = newAusAuslandGeholt;
		boolean oldAusAuslandGeholtESet = ausAuslandGeholtESet;
		ausAuslandGeholtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT, oldAusAuslandGeholt, ausAuslandGeholt, !oldAusAuslandGeholtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAusAuslandGeholt() {
		boolean oldAusAuslandGeholt = ausAuslandGeholt;
		boolean oldAusAuslandGeholtESet = ausAuslandGeholtESet;
		ausAuslandGeholt = AUS_AUSLAND_GEHOLT_EDEFAULT;
		ausAuslandGeholtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT, oldAusAuslandGeholt, AUS_AUSLAND_GEHOLT_EDEFAULT, oldAusAuslandGeholtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAusAuslandGeholt() {
		return ausAuslandGeholtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeldeanschriftType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(MeldeanschriftType newAnschrift, NotificationChain msgs) {
		MeldeanschriftType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(MeldeanschriftType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS, oldAufenthaltsstatus, newAufenthaltsstatus);
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
				msgs = ((InternalEObject)aufenthaltsstatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS, null, msgs);
			if (newAufenthaltsstatus != null)
				msgs = ((InternalEObject)newAufenthaltsstatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS, null, msgs);
			msgs = basicSetAufenthaltsstatus(newAufenthaltsstatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS, newAufenthaltsstatus, newAufenthaltsstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS:
				return basicSetAufenthaltsstatus(null, msgs);
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
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT:
				return getGeburt();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT:
				return getReligionszugehoerigkeit();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT:
				return isAusAuslandGeholt();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT:
				return getAnschrift();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS:
				return getAufenthaltsstatus();
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
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT:
				setReligionszugehoerigkeit((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT:
				setAusAuslandGeholt((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)newValue);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)newValue);
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
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)null);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT:
				setReligionszugehoerigkeit(RELIGIONSZUGEHOERIGKEIT_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT:
				unsetAusAuslandGeholt();
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)null);
				return;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)null);
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
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__GEBURT:
				return geburt != null;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__RELIGIONSZUGEHOERIGKEIT:
				return RELIGIONSZUGEHOERIGKEIT_EDEFAULT == null ? religionszugehoerigkeit != null : !RELIGIONSZUGEHOERIGKEIT_EDEFAULT.equals(religionszugehoerigkeit);
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUS_AUSLAND_GEHOLT:
				return isSetAusAuslandGeholt();
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__ANSCHRIFT:
				return anschrift != null;
			case AdoptionPackage.ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES_TYPE__AUFENTHALTSSTATUS:
				return aufenthaltsstatus != null;
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
		result.append(" (religionszugehoerigkeit: ");
		result.append(religionszugehoerigkeit);
		result.append(", ausAuslandGeholt: ");
		if (ausAuslandGeholtESet) result.append(ausAuslandGeholt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenDesZuAdoptierendenKindesTypeImpl

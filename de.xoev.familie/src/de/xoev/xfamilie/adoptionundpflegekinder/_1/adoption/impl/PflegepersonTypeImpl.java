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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BestimmtesKindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenUndWohnenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.MoeglichkeitenUndGrenzenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType;

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
 * An implementation of the model object '<em><b>Pflegeperson Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getBeratungscode <em>Beratungscode</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getEinkommenUndWohnen <em>Einkommen Und Wohnen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getBestimmtesKind <em>Bestimmtes Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getMoeglichkeitenUndGrenzen <em>Moeglichkeiten Und Grenzen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.PflegepersonTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PflegepersonTypeImpl extends MinimalEObjectImpl.Container implements PflegepersonType {
	/**
	 * The default value of the '{@link #getBeratungscode() <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeratungscode()
	 * @generated
	 * @ordered
	 */
	protected static final String BERATUNGSCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeratungscode() <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeratungscode()
	 * @generated
	 * @ordered
	 */
	protected String beratungscode = BERATUNGSCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatenschutzUndEinwilligung() <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzUndEinwilligungType datenschutzUndEinwilligung;

	/**
	 * The cached value of the '{@link #getAllgemeineAngaben() <em>Allgemeine Angaben</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineAngaben()
	 * @generated
	 * @ordered
	 */
	protected EList<AllgemeineAngabenPflegeType> allgemeineAngaben;

	/**
	 * The cached value of the '{@link #getEinkommenUndWohnen() <em>Einkommen Und Wohnen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenUndWohnen()
	 * @generated
	 * @ordered
	 */
	protected EinkommenUndWohnenType einkommenUndWohnen;

	/**
	 * The cached value of the '{@link #getAngabenZuKindernDerFamilie() <em>Angaben Zu Kindern Der Familie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZuKindernDerFamilie()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenZuKindernDerFamilieType> angabenZuKindernDerFamilie;

	/**
	 * The cached value of the '{@link #getWeiterePersonenImHauhalt() <em>Weitere Personen Im Hauhalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeiterePersonenImHauhalt()
	 * @generated
	 * @ordered
	 */
	protected EList<WeiterePersonenImHauhaltType> weiterePersonenImHauhalt;

	/**
	 * The cached value of the '{@link #getBestimmtesKind() <em>Bestimmtes Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestimmtesKind()
	 * @generated
	 * @ordered
	 */
	protected BestimmtesKindType bestimmtesKind;

	/**
	 * The cached value of the '{@link #getMoeglichkeitenUndGrenzen() <em>Moeglichkeiten Und Grenzen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoeglichkeitenUndGrenzen()
	 * @generated
	 * @ordered
	 */
	protected MoeglichkeitenUndGrenzenType moeglichkeitenUndGrenzen;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisType> nachweise;

	/**
	 * The cached value of the '{@link #getDatenschutzDerFachbehoerde() <em>Datenschutz Der Fachbehoerde</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzDerFachbehoerde()
	 * @generated
	 * @ordered
	 */
	protected EList<DatenschutzUndEinwilligungType> datenschutzDerFachbehoerde;

	/**
	 * The cached value of the '{@link #getSignatur() <em>Signatur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatur()
	 * @generated
	 * @ordered
	 */
	protected SignaturType signatur;

	/**
	 * The cached value of the '{@link #getDigitalerRueckkanal() <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 * @ordered
	 */
	protected DigitalerRueckkanalType digitalerRueckkanal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PflegepersonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.PFLEGEPERSON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeratungscode() {
		return beratungscode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeratungscode(String newBeratungscode) {
		String oldBeratungscode = beratungscode;
		beratungscode = newBeratungscode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__BERATUNGSCODE, oldBeratungscode, beratungscode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung() {
		return datenschutzUndEinwilligung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung, NotificationChain msgs) {
		DatenschutzUndEinwilligungType oldDatenschutzUndEinwilligung = datenschutzUndEinwilligung;
		datenschutzUndEinwilligung = newDatenschutzUndEinwilligung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
	public void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung) {
		if (newDatenschutzUndEinwilligung != datenschutzUndEinwilligung) {
			NotificationChain msgs = null;
			if (datenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllgemeineAngabenPflegeType> getAllgemeineAngaben() {
		if (allgemeineAngaben == null) {
			allgemeineAngaben = new EObjectContainmentEList<AllgemeineAngabenPflegeType>(AllgemeineAngabenPflegeType.class, this, AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN);
		}
		return allgemeineAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenUndWohnenType getEinkommenUndWohnen() {
		return einkommenUndWohnen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommenUndWohnen(EinkommenUndWohnenType newEinkommenUndWohnen, NotificationChain msgs) {
		EinkommenUndWohnenType oldEinkommenUndWohnen = einkommenUndWohnen;
		einkommenUndWohnen = newEinkommenUndWohnen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN, oldEinkommenUndWohnen, newEinkommenUndWohnen);
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
	public void setEinkommenUndWohnen(EinkommenUndWohnenType newEinkommenUndWohnen) {
		if (newEinkommenUndWohnen != einkommenUndWohnen) {
			NotificationChain msgs = null;
			if (einkommenUndWohnen != null)
				msgs = ((InternalEObject)einkommenUndWohnen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN, null, msgs);
			if (newEinkommenUndWohnen != null)
				msgs = ((InternalEObject)newEinkommenUndWohnen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN, null, msgs);
			msgs = basicSetEinkommenUndWohnen(newEinkommenUndWohnen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN, newEinkommenUndWohnen, newEinkommenUndWohnen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenZuKindernDerFamilieType> getAngabenZuKindernDerFamilie() {
		if (angabenZuKindernDerFamilie == null) {
			angabenZuKindernDerFamilie = new EObjectContainmentEList<AngabenZuKindernDerFamilieType>(AngabenZuKindernDerFamilieType.class, this, AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		}
		return angabenZuKindernDerFamilie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeiterePersonenImHauhaltType> getWeiterePersonenImHauhalt() {
		if (weiterePersonenImHauhalt == null) {
			weiterePersonenImHauhalt = new EObjectContainmentEList<WeiterePersonenImHauhaltType>(WeiterePersonenImHauhaltType.class, this, AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		}
		return weiterePersonenImHauhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BestimmtesKindType getBestimmtesKind() {
		return bestimmtesKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestimmtesKind(BestimmtesKindType newBestimmtesKind, NotificationChain msgs) {
		BestimmtesKindType oldBestimmtesKind = bestimmtesKind;
		bestimmtesKind = newBestimmtesKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND, oldBestimmtesKind, newBestimmtesKind);
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
	public void setBestimmtesKind(BestimmtesKindType newBestimmtesKind) {
		if (newBestimmtesKind != bestimmtesKind) {
			NotificationChain msgs = null;
			if (bestimmtesKind != null)
				msgs = ((InternalEObject)bestimmtesKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND, null, msgs);
			if (newBestimmtesKind != null)
				msgs = ((InternalEObject)newBestimmtesKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND, null, msgs);
			msgs = basicSetBestimmtesKind(newBestimmtesKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND, newBestimmtesKind, newBestimmtesKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoeglichkeitenUndGrenzenType getMoeglichkeitenUndGrenzen() {
		return moeglichkeitenUndGrenzen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMoeglichkeitenUndGrenzen(MoeglichkeitenUndGrenzenType newMoeglichkeitenUndGrenzen, NotificationChain msgs) {
		MoeglichkeitenUndGrenzenType oldMoeglichkeitenUndGrenzen = moeglichkeitenUndGrenzen;
		moeglichkeitenUndGrenzen = newMoeglichkeitenUndGrenzen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN, oldMoeglichkeitenUndGrenzen, newMoeglichkeitenUndGrenzen);
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
	public void setMoeglichkeitenUndGrenzen(MoeglichkeitenUndGrenzenType newMoeglichkeitenUndGrenzen) {
		if (newMoeglichkeitenUndGrenzen != moeglichkeitenUndGrenzen) {
			NotificationChain msgs = null;
			if (moeglichkeitenUndGrenzen != null)
				msgs = ((InternalEObject)moeglichkeitenUndGrenzen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN, null, msgs);
			if (newMoeglichkeitenUndGrenzen != null)
				msgs = ((InternalEObject)newMoeglichkeitenUndGrenzen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN, null, msgs);
			msgs = basicSetMoeglichkeitenUndGrenzen(newMoeglichkeitenUndGrenzen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN, newMoeglichkeitenUndGrenzen, newMoeglichkeitenUndGrenzen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE);
		}
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatenschutzUndEinwilligungType> getDatenschutzDerFachbehoerde() {
		if (datenschutzDerFachbehoerde == null) {
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		}
		return datenschutzDerFachbehoerde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturType getSignatur() {
		return signatur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatur(SignaturType newSignatur, NotificationChain msgs) {
		SignaturType oldSignatur = signatur;
		signatur = newSignatur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR, oldSignatur, newSignatur);
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
	public void setSignatur(SignaturType newSignatur) {
		if (newSignatur != signatur) {
			NotificationChain msgs = null;
			if (signatur != null)
				msgs = ((InternalEObject)signatur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR, null, msgs);
			if (newSignatur != null)
				msgs = ((InternalEObject)newSignatur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR, null, msgs);
			msgs = basicSetSignatur(newSignatur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR, newSignatur, newSignatur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalerRueckkanalType getDigitalerRueckkanal() {
		return digitalerRueckkanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal, NotificationChain msgs) {
		DigitalerRueckkanalType oldDigitalerRueckkanal = digitalerRueckkanal;
		digitalerRueckkanal = newDigitalerRueckkanal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
	public void setDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal) {
		if (newDigitalerRueckkanal != digitalerRueckkanal) {
			NotificationChain msgs = null;
			if (digitalerRueckkanal != null)
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return ((InternalEList<?>)getAllgemeineAngaben()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN:
				return basicSetEinkommenUndWohnen(null, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return ((InternalEList<?>)getAngabenZuKindernDerFamilie()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return ((InternalEList<?>)getWeiterePersonenImHauhalt()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND:
				return basicSetBestimmtesKind(null, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN:
				return basicSetMoeglichkeitenUndGrenzen(null, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR:
				return basicSetSignatur(null, msgs);
			case AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				return basicSetDigitalerRueckkanal(null, msgs);
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
			case AdoptionPackage.PFLEGEPERSON_TYPE__BERATUNGSCODE:
				return getBeratungscode();
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return getAllgemeineAngaben();
			case AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN:
				return getEinkommenUndWohnen();
			case AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return getAngabenZuKindernDerFamilie();
			case AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return getWeiterePersonenImHauhalt();
			case AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND:
				return getBestimmtesKind();
			case AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN:
				return getMoeglichkeitenUndGrenzen();
			case AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR:
				return getSignatur();
			case AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				return getDigitalerRueckkanal();
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
			case AdoptionPackage.PFLEGEPERSON_TYPE__BERATUNGSCODE:
				setBeratungscode((String)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				getAllgemeineAngaben().addAll((Collection<? extends AllgemeineAngabenPflegeType>)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN:
				setEinkommenUndWohnen((EinkommenUndWohnenType)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				getAngabenZuKindernDerFamilie().addAll((Collection<? extends AngabenZuKindernDerFamilieType>)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				getWeiterePersonenImHauhalt().addAll((Collection<? extends WeiterePersonenImHauhaltType>)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND:
				setBestimmtesKind((BestimmtesKindType)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN:
				setMoeglichkeitenUndGrenzen((MoeglichkeitenUndGrenzenType)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR:
				setSignatur((SignaturType)newValue);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)newValue);
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
			case AdoptionPackage.PFLEGEPERSON_TYPE__BERATUNGSCODE:
				setBeratungscode(BERATUNGSCODE_EDEFAULT);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN:
				setEinkommenUndWohnen((EinkommenUndWohnenType)null);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND:
				setBestimmtesKind((BestimmtesKindType)null);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN:
				setMoeglichkeitenUndGrenzen((MoeglichkeitenUndGrenzenType)null);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR:
				setSignatur((SignaturType)null);
				return;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)null);
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
			case AdoptionPackage.PFLEGEPERSON_TYPE__BERATUNGSCODE:
				return BERATUNGSCODE_EDEFAULT == null ? beratungscode != null : !BERATUNGSCODE_EDEFAULT.equals(beratungscode);
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ALLGEMEINE_ANGABEN:
				return allgemeineAngaben != null && !allgemeineAngaben.isEmpty();
			case AdoptionPackage.PFLEGEPERSON_TYPE__EINKOMMEN_UND_WOHNEN:
				return einkommenUndWohnen != null;
			case AdoptionPackage.PFLEGEPERSON_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return angabenZuKindernDerFamilie != null && !angabenZuKindernDerFamilie.isEmpty();
			case AdoptionPackage.PFLEGEPERSON_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return weiterePersonenImHauhalt != null && !weiterePersonenImHauhalt.isEmpty();
			case AdoptionPackage.PFLEGEPERSON_TYPE__BESTIMMTES_KIND:
				return bestimmtesKind != null;
			case AdoptionPackage.PFLEGEPERSON_TYPE__MOEGLICHKEITEN_UND_GRENZEN:
				return moeglichkeitenUndGrenzen != null;
			case AdoptionPackage.PFLEGEPERSON_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.PFLEGEPERSON_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.PFLEGEPERSON_TYPE__SIGNATUR:
				return signatur != null;
			case AdoptionPackage.PFLEGEPERSON_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
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
		result.append(" (beratungscode: ");
		result.append(beratungscode);
		result.append(')');
		return result.toString();
	}

} //PflegepersonTypeImpl

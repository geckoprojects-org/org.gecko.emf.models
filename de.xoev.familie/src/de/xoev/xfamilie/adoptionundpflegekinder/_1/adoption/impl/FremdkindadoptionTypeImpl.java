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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.FremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
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
 * An implementation of the model object '<em><b>Fremdkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getBeratungscode <em>Beratungscode</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getAuseinandersetzungThemaAdoption <em>Auseinandersetzung Thema Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.FremdkindadoptionTypeImpl#isAertzlicheBehandlung <em>Aertzliche Behandlung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FremdkindadoptionTypeImpl extends MinimalEObjectImpl.Container implements FremdkindadoptionType {
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
	 * The cached value of the '{@link #getAllgemeineAngaben() <em>Allgemeine Angaben</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineAngaben()
	 * @generated
	 * @ordered
	 */
	protected EList<AllgemeineAngabenFremdkindadoptionType> allgemeineAngaben;

	/**
	 * The cached value of the '{@link #getAngabenZurPartnerschaft() <em>Angaben Zur Partnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurPartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected AngabenZurPartnerschaftType angabenZurPartnerschaft;

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
	 * The default value of the '{@link #getAuseinandersetzungThemaAdoption() <em>Auseinandersetzung Thema Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuseinandersetzungThemaAdoption()
	 * @generated
	 * @ordered
	 */
	protected static final String AUSEINANDERSETZUNG_THEMA_ADOPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuseinandersetzungThemaAdoption() <em>Auseinandersetzung Thema Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuseinandersetzungThemaAdoption()
	 * @generated
	 * @ordered
	 */
	protected String auseinandersetzungThemaAdoption = AUSEINANDERSETZUNG_THEMA_ADOPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getDatenschutzUndEinwilligung() <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzUndEinwilligungType datenschutzUndEinwilligung;

	/**
	 * The default value of the '{@link #isAertzlicheBehandlung() <em>Aertzliche Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAertzlicheBehandlung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AERTZLICHE_BEHANDLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAertzlicheBehandlung() <em>Aertzliche Behandlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAertzlicheBehandlung()
	 * @generated
	 * @ordered
	 */
	protected boolean aertzlicheBehandlung = AERTZLICHE_BEHANDLUNG_EDEFAULT;

	/**
	 * This is true if the Aertzliche Behandlung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aertzlicheBehandlungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FremdkindadoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.FREMDKINDADOPTION_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__BERATUNGSCODE, oldBeratungscode, beratungscode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllgemeineAngabenFremdkindadoptionType> getAllgemeineAngaben() {
		if (allgemeineAngaben == null) {
			allgemeineAngaben = new EObjectContainmentEList<AllgemeineAngabenFremdkindadoptionType>(AllgemeineAngabenFremdkindadoptionType.class, this, AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN);
		}
		return allgemeineAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZurPartnerschaftType getAngabenZurPartnerschaft() {
		return angabenZurPartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurPartnerschaft(AngabenZurPartnerschaftType newAngabenZurPartnerschaft, NotificationChain msgs) {
		AngabenZurPartnerschaftType oldAngabenZurPartnerschaft = angabenZurPartnerschaft;
		angabenZurPartnerschaft = newAngabenZurPartnerschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, oldAngabenZurPartnerschaft, newAngabenZurPartnerschaft);
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
	public void setAngabenZurPartnerschaft(AngabenZurPartnerschaftType newAngabenZurPartnerschaft) {
		if (newAngabenZurPartnerschaft != angabenZurPartnerschaft) {
			NotificationChain msgs = null;
			if (angabenZurPartnerschaft != null)
				msgs = ((InternalEObject)angabenZurPartnerschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, null, msgs);
			if (newAngabenZurPartnerschaft != null)
				msgs = ((InternalEObject)newAngabenZurPartnerschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, null, msgs);
			msgs = basicSetAngabenZurPartnerschaft(newAngabenZurPartnerschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, newAngabenZurPartnerschaft, newAngabenZurPartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenZuKindernDerFamilieType> getAngabenZuKindernDerFamilie() {
		if (angabenZuKindernDerFamilie == null) {
			angabenZuKindernDerFamilie = new EObjectContainmentEList<AngabenZuKindernDerFamilieType>(AngabenZuKindernDerFamilieType.class, this, AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
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
			weiterePersonenImHauhalt = new EObjectContainmentEList<WeiterePersonenImHauhaltType>(WeiterePersonenImHauhaltType.class, this, AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		}
		return weiterePersonenImHauhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuseinandersetzungThemaAdoption() {
		return auseinandersetzungThemaAdoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuseinandersetzungThemaAdoption(String newAuseinandersetzungThemaAdoption) {
		String oldAuseinandersetzungThemaAdoption = auseinandersetzungThemaAdoption;
		auseinandersetzungThemaAdoption = newAuseinandersetzungThemaAdoption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION, oldAuseinandersetzungThemaAdoption, auseinandersetzungThemaAdoption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE);
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
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR, oldSignatur, newSignatur);
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
				msgs = ((InternalEObject)signatur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR, null, msgs);
			if (newSignatur != null)
				msgs = ((InternalEObject)newSignatur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR, null, msgs);
			msgs = basicSetSignatur(newSignatur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR, newSignatur, newSignatur));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAertzlicheBehandlung() {
		return aertzlicheBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAertzlicheBehandlung(boolean newAertzlicheBehandlung) {
		boolean oldAertzlicheBehandlung = aertzlicheBehandlung;
		aertzlicheBehandlung = newAertzlicheBehandlung;
		boolean oldAertzlicheBehandlungESet = aertzlicheBehandlungESet;
		aertzlicheBehandlungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG, oldAertzlicheBehandlung, aertzlicheBehandlung, !oldAertzlicheBehandlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAertzlicheBehandlung() {
		boolean oldAertzlicheBehandlung = aertzlicheBehandlung;
		boolean oldAertzlicheBehandlungESet = aertzlicheBehandlungESet;
		aertzlicheBehandlung = AERTZLICHE_BEHANDLUNG_EDEFAULT;
		aertzlicheBehandlungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG, oldAertzlicheBehandlung, AERTZLICHE_BEHANDLUNG_EDEFAULT, oldAertzlicheBehandlungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAertzlicheBehandlung() {
		return aertzlicheBehandlungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return ((InternalEList<?>)getAllgemeineAngaben()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return basicSetAngabenZurPartnerschaft(null, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return ((InternalEList<?>)getAngabenZuKindernDerFamilie()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return ((InternalEList<?>)getWeiterePersonenImHauhalt()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR:
				return basicSetSignatur(null, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return basicSetDigitalerRueckkanal(null, msgs);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
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
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__BERATUNGSCODE:
				return getBeratungscode();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return getAllgemeineAngaben();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return getAngabenZurPartnerschaft();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return getAngabenZuKindernDerFamilie();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return getWeiterePersonenImHauhalt();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION:
				return getAuseinandersetzungThemaAdoption();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR:
				return getSignatur();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return getDigitalerRueckkanal();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG:
				return isAertzlicheBehandlung();
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
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__BERATUNGSCODE:
				setBeratungscode((String)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				getAllgemeineAngaben().addAll((Collection<? extends AllgemeineAngabenFremdkindadoptionType>)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				setAngabenZurPartnerschaft((AngabenZurPartnerschaftType)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				getAngabenZuKindernDerFamilie().addAll((Collection<? extends AngabenZuKindernDerFamilieType>)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				getWeiterePersonenImHauhalt().addAll((Collection<? extends WeiterePersonenImHauhaltType>)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION:
				setAuseinandersetzungThemaAdoption((String)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR:
				setSignatur((SignaturType)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG:
				setAertzlicheBehandlung((Boolean)newValue);
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
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__BERATUNGSCODE:
				setBeratungscode(BERATUNGSCODE_EDEFAULT);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				getAllgemeineAngaben().clear();
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				setAngabenZurPartnerschaft((AngabenZurPartnerschaftType)null);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION:
				setAuseinandersetzungThemaAdoption(AUSEINANDERSETZUNG_THEMA_ADOPTION_EDEFAULT);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR:
				setSignatur((SignaturType)null);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)null);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG:
				unsetAertzlicheBehandlung();
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
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__BERATUNGSCODE:
				return BERATUNGSCODE_EDEFAULT == null ? beratungscode != null : !BERATUNGSCODE_EDEFAULT.equals(beratungscode);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return allgemeineAngaben != null && !allgemeineAngaben.isEmpty();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return angabenZurPartnerschaft != null;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return angabenZuKindernDerFamilie != null && !angabenZuKindernDerFamilie.isEmpty();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return weiterePersonenImHauhalt != null && !weiterePersonenImHauhalt.isEmpty();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AUSEINANDERSETZUNG_THEMA_ADOPTION:
				return AUSEINANDERSETZUNG_THEMA_ADOPTION_EDEFAULT == null ? auseinandersetzungThemaAdoption != null : !AUSEINANDERSETZUNG_THEMA_ADOPTION_EDEFAULT.equals(auseinandersetzungThemaAdoption);
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__SIGNATUR:
				return signatur != null;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.FREMDKINDADOPTION_TYPE__AERTZLICHE_BEHANDLUNG:
				return isSetAertzlicheBehandlung();
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
		result.append(", auseinandersetzungThemaAdoption: ");
		result.append(auseinandersetzungThemaAdoption);
		result.append(", aertzlicheBehandlung: ");
		if (aertzlicheBehandlungESet) result.append(aertzlicheBehandlung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FremdkindadoptionTypeImpl

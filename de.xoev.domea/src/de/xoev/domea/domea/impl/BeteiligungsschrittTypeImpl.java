/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.BearbeitungType;
import de.xoev.domea.domea.BeteiligungsschrittType;
import de.xoev.domea.domea.BeteiligungsstatusCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.VerfuegungType;

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
 * An implementation of the model object '<em><b>Beteiligungsschritt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getNummer <em>Nummer</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getVerfuegung <em>Verfuegung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getBearbeitung <em>Bearbeitung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getParallelZuBeteiligungsschritt <em>Parallel Zu Beteiligungsschritt</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl#getVersionNummer <em>Version Nummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeteiligungsschrittTypeImpl extends MinimalEObjectImpl.Container implements BeteiligungsschrittType {
	/**
	 * The default value of the '{@link #getNummer() <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummer()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNummer() <em>Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNummer()
	 * @generated
	 * @ordered
	 */
	protected String nummer = NUMMER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected BeteiligungsstatusCodeType status;

	/**
	 * The cached value of the '{@link #getVerfuegung() <em>Verfuegung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegung()
	 * @generated
	 * @ordered
	 */
	protected VerfuegungType verfuegung;

	/**
	 * The cached value of the '{@link #getBearbeitung() <em>Bearbeitung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitung()
	 * @generated
	 * @ordered
	 */
	protected BearbeitungType bearbeitung;

	/**
	 * The cached value of the '{@link #getParallelZuBeteiligungsschritt() <em>Parallel Zu Beteiligungsschritt</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelZuBeteiligungsschritt()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parallelZuBeteiligungsschritt;

	/**
	 * The default value of the '{@link #getVersionNummer() <em>Version Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNummer()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersionNummer() <em>Version Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionNummer()
	 * @generated
	 * @ordered
	 */
	protected String versionNummer = VERSION_NUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeteiligungsschrittTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.BETEILIGUNGSSCHRITT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNummer() {
		return nummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNummer(String newNummer) {
		String oldNummer = nummer;
		nummer = newNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__NUMMER, oldNummer, nummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeteiligungsstatusCodeType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(BeteiligungsstatusCodeType newStatus, NotificationChain msgs) {
		BeteiligungsstatusCodeType oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS, oldStatus, newStatus);
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
	public void setStatus(BeteiligungsstatusCodeType newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerfuegungType getVerfuegung() {
		return verfuegung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerfuegung(VerfuegungType newVerfuegung, NotificationChain msgs) {
		VerfuegungType oldVerfuegung = verfuegung;
		verfuegung = newVerfuegung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG, oldVerfuegung, newVerfuegung);
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
	public void setVerfuegung(VerfuegungType newVerfuegung) {
		if (newVerfuegung != verfuegung) {
			NotificationChain msgs = null;
			if (verfuegung != null)
				msgs = ((InternalEObject)verfuegung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG, null, msgs);
			if (newVerfuegung != null)
				msgs = ((InternalEObject)newVerfuegung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG, null, msgs);
			msgs = basicSetVerfuegung(newVerfuegung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG, newVerfuegung, newVerfuegung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BearbeitungType getBearbeitung() {
		return bearbeitung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeitung(BearbeitungType newBearbeitung, NotificationChain msgs) {
		BearbeitungType oldBearbeitung = bearbeitung;
		bearbeitung = newBearbeitung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG, oldBearbeitung, newBearbeitung);
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
	public void setBearbeitung(BearbeitungType newBearbeitung) {
		if (newBearbeitung != bearbeitung) {
			NotificationChain msgs = null;
			if (bearbeitung != null)
				msgs = ((InternalEObject)bearbeitung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG, null, msgs);
			if (newBearbeitung != null)
				msgs = ((InternalEObject)newBearbeitung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG, null, msgs);
			msgs = basicSetBearbeitung(newBearbeitung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG, newBearbeitung, newBearbeitung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParallelZuBeteiligungsschritt() {
		if (parallelZuBeteiligungsschritt == null) {
			parallelZuBeteiligungsschritt = new EDataTypeEList<String>(String.class, this, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT);
		}
		return parallelZuBeteiligungsschritt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersionNummer() {
		return versionNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersionNummer(String newVersionNummer) {
		String oldVersionNummer = versionNummer;
		versionNummer = newVersionNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER, oldVersionNummer, versionNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS:
				return basicSetStatus(null, msgs);
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG:
				return basicSetVerfuegung(null, msgs);
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG:
				return basicSetBearbeitung(null, msgs);
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
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__NUMMER:
				return getNummer();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS:
				return getStatus();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG:
				return getVerfuegung();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG:
				return getBearbeitung();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT:
				return getParallelZuBeteiligungsschritt();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER:
				return getVersionNummer();
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
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__NUMMER:
				setNummer((String)newValue);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS:
				setStatus((BeteiligungsstatusCodeType)newValue);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG:
				setVerfuegung((VerfuegungType)newValue);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG:
				setBearbeitung((BearbeitungType)newValue);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT:
				getParallelZuBeteiligungsschritt().clear();
				getParallelZuBeteiligungsschritt().addAll((Collection<? extends String>)newValue);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER:
				setVersionNummer((String)newValue);
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
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__NUMMER:
				setNummer(NUMMER_EDEFAULT);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS:
				setStatus((BeteiligungsstatusCodeType)null);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG:
				setVerfuegung((VerfuegungType)null);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG:
				setBearbeitung((BearbeitungType)null);
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT:
				getParallelZuBeteiligungsschritt().clear();
				return;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER:
				setVersionNummer(VERSION_NUMMER_EDEFAULT);
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
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__NUMMER:
				return NUMMER_EDEFAULT == null ? nummer != null : !NUMMER_EDEFAULT.equals(nummer);
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__STATUS:
				return status != null;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG:
				return verfuegung != null;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG:
				return bearbeitung != null;
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT:
				return parallelZuBeteiligungsschritt != null && !parallelZuBeteiligungsschritt.isEmpty();
			case DomeaPackage.BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER:
				return VERSION_NUMMER_EDEFAULT == null ? versionNummer != null : !VERSION_NUMMER_EDEFAULT.equals(versionNummer);
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
		result.append(" (nummer: ");
		result.append(nummer);
		result.append(", parallelZuBeteiligungsschritt: ");
		result.append(parallelZuBeteiligungsschritt);
		result.append(", versionNummer: ");
		result.append(versionNummer);
		result.append(')');
		return result.toString();
	}

} //BeteiligungsschrittTypeImpl

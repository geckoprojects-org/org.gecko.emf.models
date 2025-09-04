/*
 */
package de.xoev.domea.domea;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Geburt fasst geburtsbezogene Informationen einer natürlichen Person zusammen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.GeburtType#getDatum <em>Datum</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getGeburtType()
 * @model extendedMetaData="name='GeburtType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GeburtType extends EObject {
	/**
	 * Returns the value of the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Datum der Geburt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum</em>' attribute.
	 * @see #setDatum(XMLGregorianCalendar)
	 * @see de.xoev.domea.domea.DomeaPackage#getGeburtType_Datum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
	 *        extendedMetaData="kind='element' name='Datum' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getDatum();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.GeburtType#getDatum <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum</em>' attribute.
	 * @see #getDatum()
	 * @generated
	 */
	void setDatum(XMLGregorianCalendar value);

} // GeburtType

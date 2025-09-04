/*
 */
package de.xoev.domea.domea;

import code.Code;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staat Code Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Der Datentyp zur Werteliste von Staaten unter Angabe weiterer Informationen zur konkreten Angabe eines Wertes. Genutzt wird hier die ISO-3166-1-Liste. Für den Schlüssel (code) wird die Spalte "ALPHA2" und für den beschreibenden Namen (name) die Spalte "Name des Landes" verwendet.
 * <!-- end-model-doc -->
 *
 *
 * @see de.xoev.domea.domea.DomeaPackage#getStaatCodeType()
 * @model extendedMetaData="name='StaatCodeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StaatCodeType extends Code {
} // StaatCodeType

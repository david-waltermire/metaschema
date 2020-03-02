<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    xmlns:math="http://www.w3.org/2005/xpath-functions/math"
    xmlns="http://csrc.nist.gov/ns/oscal/metaschema/1.0"
    xpath-default-namespace="http://csrc.nist.gov/ns/oscal/metaschema/1.0"
    xmlns:html="http://www.w3.org/1999/xhtml"
    
    exclude-result-prefixes="#all"
    version="3.0">
    
    <xsl:mode on-no-match="shallow-copy"/>
    
    <xsl:template match="*[exists(@group-name)]">
        <group name="{@group-name}" in-xml="{ if (@group-xml='GROUPED') then 'SHOWN' else 'HIDDEN' }" max-occurs="1" min-occurs="{ if (@min-occurs='0') then '0' else '1'}">
            <xsl:next-match/>
        </group>
    </xsl:template>
    
    <!--<xsl:template match="assembly//assembly[@name=/*/assembly/@name]">
        <xsl:copy>
            <xsl:copy-of select="@*"/>
        </xsl:copy>
    </xsl:template>-->
    <!--<xsl:template match="*[exists(@group-name)]/@min-occurs[.='0']">
        <xsl:attribute name="min-occurs">1</xsl:attribute>
    </xsl:template>-->
    
   
</xsl:stylesheet>